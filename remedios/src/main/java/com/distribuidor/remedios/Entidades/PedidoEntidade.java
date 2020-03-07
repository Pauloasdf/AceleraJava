package com.distribuidor.remedios.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
@Data
@NoArgsConstructor
public class PedidoEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pedidoId")
    private Long pedidoId;

    @Column(name = "data_pedido")
    private String dataPedido;

    @Column (name = "origem_pedido")
    private String origemPedido;

    @Column (name = "item_pedido_id")
    private Long itemPedidoId;


    public PedidoEntidade(Long pedidoId, String dataPedido, String origemPedido, Long itemPedidoId){
        this.pedidoId = pedidoId;
        this.dataPedido = dataPedido;
        this.origemPedido = origemPedido;
        this.itemPedidoId = itemPedidoId;
    }

    public PedidoEntidade() {

    }

    public Long getPedidoId() {return pedidoId;}
    public void setPedidoId(Long pedidoId) {this.pedidoId = pedidoId;}
    public String getDataPedido() { return dataPedido; }
    public void setDataPedido(String dataPedido) {this.dataPedido = dataPedido;}
    public String getOrigemPedido() {return origemPedido;}
    public void setOrigemPedido(String origemPedido) {this.origemPedido = origemPedido;}
    public Long getItemPedidoId() {return itemPedidoId;}
    public void setItemPedidoId(Long itemPedidoId) {this.itemPedidoId = itemPedidoId;}
}
