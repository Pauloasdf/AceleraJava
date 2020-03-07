package com.distribuidor.remedios.Servico;

import com.distribuidor.remedios.DTO.ItemPedidoDTO;
import com.distribuidor.remedios.Entidades.ItemPedidoEntidade;
import com.distribuidor.remedios.Repositorio.ItemPedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoServico {

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    public List<ItemPedidoEntidade> listar() {
        return itemPedidoRepositorio.findAll();
    }

    public ItemPedidoEntidade salvar(ItemPedidoDTO itemPedidoDTO) {
        ItemPedidoEntidade itemPedidoEntidade = new ItemPedidoEntidade();

        itemPedidoEntidade.setProdutoId(itemPedidoDTO.getProdutoId());
        itemPedidoEntidade.setQuantidade(itemPedidoDTO.getQuantidade());
        return itemPedidoRepositorio.save(itemPedidoEntidade);
    }

    public void buscar(Long itemPedidoId) {
        ItemPedidoEntidade itemPedidoEntidade = itemPedidoRepositorio.findByItemPedidoId(itemPedidoId);
    }
}

