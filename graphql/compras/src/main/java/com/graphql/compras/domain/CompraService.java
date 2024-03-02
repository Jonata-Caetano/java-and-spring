package com.graphql.compras.domain;

import com.graphql.compras.graphql.dto.CompraResumo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
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

    public List<Compra> findAll(Pageable pageable) {
        return repository.findAll(pageable).getContent();
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

    public List<Compra> findAllByCliente(Cliente cliente) {
        return repository.findAllByCliente(cliente);
    }

    public List<CompraResumo> findAllComprasRelatorio() {
        return repository.findAllComprasRelatorio();
    }
}
