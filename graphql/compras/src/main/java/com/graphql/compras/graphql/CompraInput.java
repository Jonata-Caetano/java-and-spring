package com.graphql.compras.graphql;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CompraInput {

    private Long id;
    private Integer quantidade;
    private String status;
    private Long clienteId;
    private Long produtoId;

}
