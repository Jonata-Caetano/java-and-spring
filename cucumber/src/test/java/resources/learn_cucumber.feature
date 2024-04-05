# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar o Cucumber
  Para que eu possa automatizar criterios de aceitacao

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
