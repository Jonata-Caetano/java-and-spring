package com.graphql.compras.graphql;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.compras.domain.ClienteService;
import com.graphql.compras.domain.Compra;
import com.graphql.compras.domain.CompraService;
import com.graphql.compras.domain.ProdutoService;
import com.graphql.compras.graphql.dto.CompraResumo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    public List<Compra> getCompras(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("quantidade").ascending());
        return service.findAll(pageable);
    }

    public Compra saveCompra(CompraInput input) {
        return service.save(Compra.builder()
                .id(input.getId())
                .data(new Date())
                .quantidade(input.getQuantidade())
                .status(input.getStatus())
                .cliente(clienteService.findById(input.getClienteId()))
                .produto(produtoService.findById(input.getProdutoId())).build());
    }

    public Boolean deleteCompra(Long id) {
        return service.deleteById(id);
    }

    public List<CompraResumo> getComprasRelatorio() {
        return service.findAllComprasRelatorio();
    }
}
