package com.graphql.compras.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Produto save(Produto produto) {
        return repository.save(produto);
    }

    @Transactional
    public Boolean deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
