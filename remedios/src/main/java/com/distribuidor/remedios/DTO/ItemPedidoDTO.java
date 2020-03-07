package com.distribuidor.remedios.DTO;


public class ItemPedidoDTO {

    private Long itemPedidoId;
    private int produtoId;
    private int quantidade;

    public ItemPedidoDTO(Long itemPedidoId,int produtoId, int quantidade) {
        this.itemPedidoId = itemPedidoId;
        this.produtoId = produtoId;
        this.quantidade = quantidade;
    }

    public Long getItemPedidoId() {return itemPedidoId;}
    public void setItemPedidoId(Long itemPedidoId) {this.itemPedidoId = itemPedidoId;}
    public int getProdutoId() {return produtoId;}
    public void setProdutoId(int produtoId) {this.produtoId = produtoId;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

}