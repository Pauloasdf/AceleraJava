package com.distribuidor.remedios.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "item_pedido")
@Data
@NoArgsConstructor
public class ItemPedidoEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_pedido_id")
    private Long itemPedidoId;

    @Column(name = "produtoId")
    private int produtoId;

    @Column(name = "quantidade")
    private int quantidade;

    public ItemPedidoEntidade(Long itemPedidoId, int produtoId) {
        this.itemPedidoId = itemPedidoId;
        this.produtoId = produtoId;
    }

    public ItemPedidoEntidade() {

    }

    public Long getItemPedidoId() {return itemPedidoId;}
    public void setItemPedidoId(Long itemPedidoId) {this.itemPedidoId = itemPedidoId;}
    public int getProdutoId() {return produtoId;}
    public void setProdutoId(int produtoId) {this.produtoId = produtoId;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    @OneToOne(mappedBy="item_pedido")
    private PedidoEntidade pedidoEntidade;

    @ManyToOne
    @JoinColumn(name="pedido")
    private PedidoEntidade pedidoEntidade;
}
