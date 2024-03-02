package com.graphql.compras.domain;

import com.graphql.compras.graphql.dto.CompraResumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraRepository extends JpaRepository <Compra, Long> {
    List<Compra> findAllByCliente(Cliente cliente);

    @Query("select new com.graphql.compras.graphql.dto.CompraResumo(compra.id, cliente.nome, produto.nome, compra.quantidade) from Compra compra inner join compra.cliente cliente inner join compra.produto produto")
    List<CompraResumo> findAllComprasRelatorio();
}
