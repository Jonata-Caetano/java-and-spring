# language: pt
Funcionalidade: Aprender Cucumber
  Como um usuário
  Eu quero cadastrar alugueis de filmes
  Para controlar preços e datas de entregas

  Cenario: Deve alguar um filme com sucesso
    Dado um filme com estoque de 2 unidades
    E que o preço de aluguel seja R$ 3
    Quando alugar
    Entao o preco do alguel sera R$ 3
    E a data de entrega sera no dia seguinte
    E o estoque do filme sera 1 unidade

  Cenario: Nao deve alguar um filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Entao não será possível por falta de estoque
    E o estoque do filme sera 0 unidades

  Cenario: Deve dar condicoes especiais para categoria extendida
    Dado um filme com estoque de 2 unidades
    E que o preço de aluguel seja R$ 4
    E que o tipo do alguel serja extendido
    Quando alugar
    Entao o preco do alguel sera R$ 8
    E a data de entrega sera em 3 dias
    E a pontuacao recebida sera de 2 pontos