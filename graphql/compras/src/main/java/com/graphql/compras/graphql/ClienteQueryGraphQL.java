package com.graphql.compras.graphql;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.compras.domain.Cliente;
import com.graphql.compras.domain.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ClienteQueryGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final ClienteService service;

    public Cliente cliente(Long id) {
        return service.findById(id);
    }

    public List<Cliente> clientes() {
        return service.findAll();
    }

    public Cliente saveCliente(ClienteInput input) {
        return service.save(Cliente.builder()
                .id(input.getId())
                .nome(input.getNome())
                .email(input.getEmail())
                .build());
    }

    public Boolean deleteCliente(Long id) {
        return service.deleteById(id);
    }
}
