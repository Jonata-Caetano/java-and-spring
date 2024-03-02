package com.graphql.compras.graphql.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompraResumo {

    private Long compraId;
    private String cliente;
    private String produto;
    private int quantidade;
}
