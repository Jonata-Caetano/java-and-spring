package com.graphql.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.compras.domain.Cliente;
import com.graphql.compras.domain.ClienteService;
import com.graphql.compras.domain.Compra;
import com.graphql.compras.domain.Produto;
import com.graphql.compras.domain.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CompraResolver implements GraphQLResolver<Compra> {

    private final ClienteService clienteService;

    private final ProdutoService produtoService;

    public String status(Compra compra) {
        return "Teste: " + compra.getStatus();
    }

    public Cliente cliente(Compra compra) {
        return clienteService.findById(compra.getCliente().getId());
    }

    public Produto produto(Compra compra) {
        return produtoService.findById(compra.getProduto().getId());
    }
}
