package com.distribuidor.remedios.DTO;


import com.distribuidor.remedios.Entidades.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class PedidoDTO {

    private Long pedidoId;
    private String dataPedido;
    private String origemPedido;
    private Long itemPedidoId;

    public PedidoDTO(Long pedidoId, String dataPedido, String origemPedido, Long itemPedidoId) {
        this.pedidoId = pedidoId;
        this.dataPedido = dataPedido;
        this.origemPedido = origemPedido;
        this.itemPedidoId = itemPedidoId;
    }

    public Long getPedidoId() {return pedidoId;}
    public void setPedidoId(Long pedidoId) {this.pedidoId = pedidoId;}
    public String getDataPedido() {return dataPedido;}
    public void setDataPedido(String dataPedido) {this.dataPedido = dataPedido;}
    public String getOrigemPedido() {return origemPedido;}
    public void setOrigemPedido(String origemPedido) {this.origemPedido = origemPedido;}
    public Long getItemPedidoId() {return itemPedidoId;}
    public void setItemPedidoId(Long itemPedidoId) {this.itemPedidoId = itemPedidoId;}
}
