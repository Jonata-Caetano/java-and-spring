package com.graphql.compras.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;

    public Cliente findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Cliente save(Cliente cliente) {
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
