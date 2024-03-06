package com.graphql.compras.domain;

import com.graphql.compras.graphql.dto.CompraResumo;
import com.graphql.compras.graphql.exception.DomainException;
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
    //@CacheEvict(value = "compras", key = "#compra.cliente.id")
    public Compra save(Compra compra) {
        if (compra.getQuantidade() > 100) {
            throw new DomainException("Não é possível fazer uma compra com mais de 100 items");
        }
        return repository.save(compra);
    }

    @Transactional
    public Boolean deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    //@Cacheable(value = "compras", key = "#cliente.id")
    public List<Compra> findAllByCliente(Cliente cliente) {
        return repository.findAllByCliente(cliente.getId());
    }

    public List<CompraResumo> findAllComprasRelatorio() {
        return repository.findAllComprasRelatorio();
    }
}
