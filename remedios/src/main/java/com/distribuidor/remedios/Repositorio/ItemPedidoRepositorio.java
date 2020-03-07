package com.distribuidor.remedios.Repositorio;

import com.distribuidor.remedios.Entidades.ItemPedidoEntidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepositorio extends JpaRepository<ItemPedidoEntidade, Long> {
    ItemPedidoEntidade findByItemPedidoId(Long itemPedidoId);
}