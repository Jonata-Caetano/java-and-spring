package steps;

import entities.Movie;
import entities.NotaAlugel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import service.RentService;

import java.time.LocalDate;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentMovieSteps {

    private Movie movie = new Movie();
    private NotaAlugel nota;
    private String erro;
    private String tipoAluguel;


    @Dado("um filme com estoque de {int} unidades")
    public void umFilmeComEstoqueDeUnidades(int arg0) {

        movie.setEstoque(arg0);
    }

    @E("que o preco de aluguel seja R$ {int}")
    public void queOPrecoDeAluguelSejaR$(int arg0) {
        movie.setAluguel(arg0);
    }

    @Dado("um filme")
    public void umFilme(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        movie.setEstoque(Integer.parseInt(map.get("estoque")));
        movie.setAluguel(Integer.parseInt(map.get("preco")));
    }

    @Quando("alugar")
    public void alugar() {
        try {
            RentService rentService = new RentService();
            nota = rentService.rent(movie, tipoAluguel);
        } catch (RuntimeException e) {
            erro = e.getMessage();
        }
    }

    @Entao("o preco do aluguel sera R$ {int}")
    public void oPrecoDoAluguelSeraR$(int arg0) {
        assertEquals(arg0, nota.getPreco());
    }

    @E("a data de entrega sera no dia seguinte")
    public void aDataDeEntregaSeraNoDiaSeguinte() {
        LocalDate date = LocalDate.now().plusDays(1);
        LocalDate dateRetorno = nota.getDataEntrega();
        assertEquals(date, dateRetorno);
    }
    @E("o estoque do filme sera {int} unidade")
    public void oEstoqueDoFilmeSeraUnidade(int arg0) {
        assertEquals(arg0, movie.getEstoque());
    }

    @Entao("não será possivel por falta de estoque")
    public void naoSeraPossivelPorFaltaDeEstoque() {
        assertEquals("Filme sem estoque", erro);
    }

    @E("que o tipo do aluguel seja extendido")
    public void queOTipoDoAluguelSejaExtendido() {
        tipoAluguel = "extendido";
    }

    @E("a data de entrega sera em {int} dias")
    public void aDataDeEntregaSeraEmDias(int arg0) {
        LocalDate date = LocalDate.now().plusDays(arg0);
        LocalDate dateRetorno = nota.getDataEntrega();
        assertEquals(date, dateRetorno);
    }

    @E("a pontuacao recebida sera de {int} pontos")
    public void aPontuacaoRecebidaSeraDePontos(int arg0) {
        assertEquals(arg0, nota.getPontuacao());
    }

    @E("que o tipo do aluguel seja comum")
    public void queOTipoDoAluguelSejaComum() {
        tipoAluguel = "comum";
    }

    @E("a pontuacao recebida sera de {int} ponto")
    public void aPontuacaoRecebidaSeraDePonto(int arg0) {
    }


}
