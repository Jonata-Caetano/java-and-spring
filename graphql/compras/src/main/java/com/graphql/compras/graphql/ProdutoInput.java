package com.graphql.compras.graphql;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutoInput {

    private Long id;
    private String nome;
    private Double valor;
}
