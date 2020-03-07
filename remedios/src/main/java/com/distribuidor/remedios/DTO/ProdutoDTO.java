package com.distribuidor.remedios.DTO;


import com.distribuidor.remedios.Entidades.ProdutoEntidade;

public class ProdutoDTO {

    private Long produtoId;
    private String produto;

    public ProdutoDTO(Long produtoId, String produto) {
        this.produtoId = produtoId;
        this.produto = produto;
    }

    public ProdutoDTO(ProdutoEntidade obj) {
    }

    public Long getProdutoId() {return produtoId;}
    public void setProdutoId(Long produtoId) {this.produtoId = produtoId;}
    public String getProduto() {return produto;}
    public void setProduto(String produto) {this.produto = produto;}
}
