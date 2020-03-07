package com.distribuidor.remedios.Repositorio;

import com.distribuidor.remedios.Entidades.PedidoEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository<PedidoEntidade, Long> {
   PedidoEntidade findByPedidoId(Long pedidoid);
}