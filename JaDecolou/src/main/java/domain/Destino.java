package domain;


import javax.persistence.*;

public class Destino {

    @Id
    @GeneratedValue(generator = "destino_passagem",strategy = GenerationType.AUTO)
    @Column(name = "id_destino")
    private Integer idDestino;
    @Column(
            name = "nome_destino"
    )
    private String nomeDestino;

    @OneToMany(
            mappedBy = "destino"
    )

    public Integer getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(Integer idDestino) {
        this.idDestino = idDestino;
    }

    public String getNomeDestino() {
        return nomeDestino;
    }

    public void setNomeDestino(String nomeDestino) {
        this.nomeDestino = nomeDestino;
    }

}
