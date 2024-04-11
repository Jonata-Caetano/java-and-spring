# language: pt
@filmes
Funcionalidade: Alugar Filme
  Como um usuario
  Eu quero cadastrar alugueis de filmes
  Para controlar precos e datas de entrega

  Cenario: Deve alugar um filme com sucesso
    Dado um filme com estoque de 2 unidades
    E que o preco de aluguel seja R$ 3
    Quando alugar
    Entao o preco do aluguel sera R$ 3
    E a data de entrega sera no dia seguinte
    E o estoque do filme sera 1 unidade

  Cenario: Não deve alugar um filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Entao não será possivel por falta de estoque
    E o estoque do filme sera 0 unidade

  Cenario: Deve dar condicoes especiais para categoria extendida
    Dado um filme com estoque de 2 unidades
    E que o preco de aluguel seja R$ 4
    E que o tipo do aluguel seja extendido
    Quando alugar
    Entao o preco do aluguel sera R$ 8
    E a data de entrega sera em 3 dias
    E a pontuacao recebida sera de 2 pontos