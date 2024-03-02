package com.graphql.compras.graphql;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.compras.domain.ClienteService;
import com.graphql.compras.domain.Compra;
import com.graphql.compras.domain.CompraService;
import com.graphql.compras.domain.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CompraQueryGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {


    private final CompraService service;
    private final ProdutoService produtoService;
    private final ClienteService clienteService;

    public Compra compra(Long id) {
        return service.findById(id);
    }

    public List<Compra> compras() {
        return service.findAll();
    }

    public Compra saveCompra(CompraInput input) {
        return service.save(Compra.builder()
                .id(input.getId())
                .data(new Date())
                .quantidade(input.getQuantidade())
                .status(input.getStatus())
                .cliente(clienteService.findById(input.getClienteId()))
                .produto(produtoService.findById(input.getProdutoId()))
                .build());
    }

    public Boolean deleteCompra(Long id) {
        return service.deleteById(id);
    }
}
