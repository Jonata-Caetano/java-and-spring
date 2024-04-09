package steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.cucumber.junit.platform.engine.Cucumber;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class LearnCucumberSteps {

    private LocalDate dataPrazo;
    private LocalDate dataEntrega;
    private String ticket;
    private double valor;
    private String nomePassageiro;
    private String telefonePassageiro;

    @Dado("que criei o arquivo corretamente")
    public void queCrieiOArquivoCorretamente() {

        System.out.println("Testando o DryRun");
    }

    @Quando("executa-lo")
    public void executaLo() {
    }

    @Então("a especificacao deve finalizar com sucesso")
    public void aEspecificacaoDeveFinalizarComSucesso() {
    }

    private Integer contador = 15;

    @Dado("que o valor do contador é {int}")
    public void queOValorDoContadorE(Integer arg0) {
        contador = arg0;
    }

    @Quando("eu incrementar em {int}")
    public void euIncremetarEm(Integer arg1) {
        contador += arg1;
    }

    @Então("o valor do contador sera {int}")
    public void oValorDoContadorSera(Integer arg2) {
        System.out.println(arg2);
        System.out.println(contador);
        assertEquals(arg2, contador);
    }
    @ParameterType(".*")
    public LocalDate localDate(String date) {

        return LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Dado("que o prazo eh dia {localDate}")
    public void queOPrazoEhDia(LocalDate data) {
        this.dataPrazo = data;
        System.out.println("Data Prazo" + dataPrazo);
    }

    @Quando("a entrega atrasar em {int} dias")
    public void aEntregaAtrasarEmDias(int diasAtraso) {
        this.dataEntrega = dataPrazo.plusDays(diasAtraso);
        System.out.println(dataPrazo.plusDays(diasAtraso));
        System.out.println("Data entrega" + dataEntrega);
    }

    @Então("a entrega sera efetuada em {localDate}")
    public void aEntregaSeraEfetuadaEm(LocalDate dataEsperada) {
        assertEquals(dataEsperada, this.dataEntrega);
        System.out.println("Data entrega" + dataEsperada);
    }

    @Dado("que o ticket é {string}")
    public void que_o_ticket_e(String ticket) {
        this.ticket = ticket;
    }

    @Dado("que o valor da passagem é R$ {double}")
    public void que_o_valor_da_passagem_e(Double valor) {
        this.valor = valor;
    }

    @Dado("que o nome do passageiro é {string}")
    public void que_o_nome_do_passageiro_e(String nome) {
        this.nomePassageiro = nome;
    }

    @Dado("que o telefone do passageiro é {string}")
    public void que_o_telefone_do_passageiro_e(String telefone) {
        this.telefonePassageiro = telefone;
    }

    @Quando("criar os steps")
    public void criar_os_steps() {
    }

    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {
        assertTrue(ticket != null && valor > 0 && nomePassageiro != null && telefonePassageiro != null);
    }

    @Dado("que o ticket especial é {string}")
    public void queOTicketEspecialE(String arg0) {
        this.ticket = ticket;
    }

}
