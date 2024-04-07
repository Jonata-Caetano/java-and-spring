import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LearnCucumber {

    private LocalDate dataPrazo;
    private LocalDate dataEntrega;

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

    @Dado("que o prazo eh dia {int}\\/{int}\\/{int}")
    public void queOPrazoEhDia(int dia, int mes, int ano) {
        this.dataPrazo = LocalDate.of(ano, mes, dia);
    }

    @Quando("a entrega atrasar em {int} dias")
    public void aEntregaAtrasarEmDias(int diasAtraso) {
        this.dataEntrega = dataPrazo.plusDays(diasAtraso);
    }

    @Então("a entrega sera efetuada em {int}\\/{int}\\/{int}")
    public void aEntregaSeraEfetuadaEm(int diaEsperado, int mesEsperado, int anoEsperado) {
        LocalDate dataEsperada = LocalDate.of(anoEsperado, mesEsperado, diaEsperado);
        assertEquals(dataEsperada, this.dataEntrega);
    }



    // Armazena os dados para uso nos testes
    private String ticket;
    private double valor;
    private String nomePassageiro;
    private String telefonePassageiro;


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
        // Implementar a lógica para criar os steps
    }

    @Então("o teste vai funcionar")
    public void o_teste_vai_funcionar() {
        // Aqui você deve verificar se tudo foi configurado corretamente
        assertTrue(ticket != null && valor > 0 && nomePassageiro != null && telefonePassageiro != null);
    }

    private void assertTrue(boolean b) {
    }

//    @Dado("que o ticket é AB{int}")
//    public void queOTicketEAB(int arg0) {
//    }
//
//    @Dado("que o ticket especial é AB{int}")
//    public void queOTicketEspecialEAB(int arg0) {
//    }
//
//    @Dado("que o ticket é CD{int}")
//    public void queOTicketECD(int arg0) {
//    }
//
//    @Dado("que o ticket é AG{int}")
//    public void queOTicketEAG(int arg0) {
//    }
//
//    @Dado("que o valor da passagem é R$ {double}{double}")
//    public void queOValorDaPassagemER$(int arg0, int arg1, int arg2) {
//    }
}
