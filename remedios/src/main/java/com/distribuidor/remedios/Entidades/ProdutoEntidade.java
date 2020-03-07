package com.distribuidor.remedios.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "produto")
@Data
@NoArgsConstructor
public class ProdutoEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id")
    private Long produtoId;

    @Column(name = "produto")
    private String produto;

    public ProdutoEntidade(Long produtoId, String produto) {
        this.produtoId = produtoId;
        this.produto = produto;
    }

    public ProdutoEntidade() {

    }

    public Long getProdutoId() {return produtoId;}
    public void setProdutoId(Long produtoId) {this.produtoId = produtoId;}
    public String getProduto() {return produto;}
    public void setProduto(String produto) {this.produto = produto;}

    @OneToOne
    @JoinColumn(name="item_pedido")
    private ItemPedidoEntidade itemPedidoEntidade;

}
