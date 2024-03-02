package com.graphql.compras.graphql;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteInput {

    private Long id;
    private String nome;
    private String email;
}
