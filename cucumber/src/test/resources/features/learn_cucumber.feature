# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar o Cucumber
  Para que eu possa automatizar criterios de aceitacao

  @execucao
  Cenario: Deve executar especificacao
    Dado que criei o arquivo corretamente
    Quando executa-lo
    Então a especificacao deve finalizar com sucesso

  Cenario: Deve incrementar contador
    Dado que o valor do contador é 15
    Quando eu incrementar em 5
    Então o valor do contador sera 20

  Cenario: Deve calcular atraso no prazo de entrega
    Dado que o prazo eh dia 05/04/2018
    Quando a entrega atrasar em 2 dias
    Então a entrega sera efetuada em 07/04/2018

  Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é "AF345"
    E que o valor da passagem é R$ 230,45
    E que o nome do passageiro é "Fulano da Silva"
    E que o telefone do passageiro é "9999-9999"
    Quando criar os steps
    Então o teste vai funcionar

  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é "AB167"
    E que o ticket especial é "AB167"
    E que o valor da passagem é R$ 1120,23
    E que o nome do passageiro é "Cicrano de Oliveira"
    E que o telefone do passageiro é "9888-8888"

#  Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
#    Dado que o ticket é CD123
#    Dado que o ticket é AG1234
#    Dado que o valor da passagem é R$ 11345,56
#    Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
#    Dado que o telefone do passageiro é "1234-5678"
#    Dado que o telefone do passageiro é "999-2223"
