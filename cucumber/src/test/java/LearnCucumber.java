import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LearnCucumber {
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


    Date entrega = new Date();

    @Dado("que o prazo eh dia {int}\\/{int}\\/{int}")
    public void queOPrazoEDia(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, mes);
        calendar.set(Calendar.YEAR, ano);
        entrega = calendar.getTime();
    }

    @Quando("a entrega atrasar em {int} dias")
    public void aEntregaAtrasarEmDias(int arg0) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(entrega);
        calendar.add(Calendar.DAY_OF_MONTH,arg0);
        entrega = calendar.getTime();
    }

    @Dado("que o prazo eh dia {int}\\/{int}\\/{int}")
    public void queOPrazoEhDia(int arg0, int arg1, int arg2) {
    }

    @Então("a entrega sera efetuada em {int}\\/{int}\\/{int}")
    public void aEntregaSeraEfetuadaEm(int arg0, int arg1, int arg2) {
    }
}
