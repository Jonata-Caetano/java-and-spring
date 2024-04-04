import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

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

}
