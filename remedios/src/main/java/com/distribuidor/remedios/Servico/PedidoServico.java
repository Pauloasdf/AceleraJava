package com.distribuidor.remedios.Servico;

import com.distribuidor.remedios.DTO.PedidoDTO;
import com.distribuidor.remedios.Entidades.PedidoEntidade;
import com.distribuidor.remedios.Repositorio.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServico {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;


    public List<PedidoEntidade> listar() {
        return pedidoRepositorio.findAll();
    }

    public PedidoEntidade salvar(PedidoDTO pedidoDTO) {
        PedidoEntidade pedidoEntidade = new PedidoEntidade();

        pedidoEntidade.setDataPedido(pedidoDTO.getDataPedido());
        pedidoEntidade.setOrigemPedido(pedidoDTO.getOrigemPedido());
        pedidoEntidade.setItemPedidoId(pedidoDTO.getItemPedidoId());
        return pedidoRepositorio.save(pedidoEntidade);

    }

    public PedidoEntidade buscar(Long pedidoId) {
        return pedidoRepositorio.findByPedidoId(pedidoId);
    }
}
