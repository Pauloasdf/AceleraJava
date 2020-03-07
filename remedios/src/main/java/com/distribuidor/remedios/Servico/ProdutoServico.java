package com.distribuidor.remedios.Servico;


import com.distribuidor.remedios.DTO.ProdutoDTO;
import com.distribuidor.remedios.Entidades.ProdutoEntidade;
import com.distribuidor.remedios.Repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServico {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;


    public List<ProdutoEntidade> listar() {
        return produtoRepositorio.findAll();
    }

    public ProdutoEntidade salvar(ProdutoDTO produtoDTO) {
        ProdutoEntidade produtoEntidade = new ProdutoEntidade();

        produtoEntidade.setProduto(produtoDTO.getProduto());

        return produtoRepositorio.save(produtoEntidade);

    }

    public ProdutoEntidade buscar(Long produtoId) {
        return (ProdutoEntidade) produtoRepositorio.findByProdutoId(produtoId);
    }
}
