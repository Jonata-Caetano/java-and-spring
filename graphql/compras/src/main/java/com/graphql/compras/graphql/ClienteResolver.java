package com.graphql.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.compras.domain.Cliente;
import com.graphql.compras.domain.Compra;
import com.graphql.compras.domain.CompraService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClienteResolver implements GraphQLResolver<Cliente> {

    private final CompraService compraService;

    public List<Compra> compras(Cliente cliente) {
        return compraService.findAllByCliente(cliente);
    }
}
