package com.graphql.compras.graphql;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.compras.domain.Produto;
import com.graphql.compras.domain.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProdutoQueryGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final ProdutoService service;

    public Produto produto(Long id) {
        return service.findById(id);
    }

    public List<Produto> produtos() {
        return service.findAll();
    }

    public Produto saveProduto(ProdutoInput input) {
        return service.save(Produto.builder()
                .id(input.getId())
                .nome(input.getNome())
                .valor(input.getValor())
                .build());
    }

    public Boolean deleteProduto(Long id) {
        return service.deleteById(id);
    }
}
