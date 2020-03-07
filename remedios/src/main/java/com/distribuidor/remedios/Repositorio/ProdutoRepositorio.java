package com.distribuidor.remedios.Repositorio;

import com.distribuidor.remedios.Entidades.ProdutoEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositorio extends JpaRepository<ProdutoEntidade, Long> {
    ProdutoRepositorio findByProdutoId(Long produtoId);
}