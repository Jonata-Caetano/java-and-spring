import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;



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
}
