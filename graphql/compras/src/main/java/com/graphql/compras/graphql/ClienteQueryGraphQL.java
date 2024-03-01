package com.graphql.compras.graphql;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClienteQueryGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final ClienteService clienteService;

    public Cliente cliente(Long id) {
        return clienteService.findById(id);
    }

    public List<Cliente> clientes() {
        return clienteService.findAll();
    }

    public Cliente saveCliente(Long id, String nome, String email) {
        return clienteService.save(Cliente.builder()
                .id(id)
                .nome(nome)
                .email(email)
                .build());
    }

    public Boolean deleteCliente(Long id) {
        return clienteService.deleteById(id);
    }
}
