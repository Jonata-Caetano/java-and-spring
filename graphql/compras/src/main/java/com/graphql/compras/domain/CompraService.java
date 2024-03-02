package com.graphql.compras.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompraService {

    private final CompraRepository repository;

    public Compra findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Compra> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Compra save(Compra cliente) {
        return repository.save(cliente);
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
