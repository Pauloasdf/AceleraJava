package com.escola.escola_tecnica.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "turma")
public class Turma {
    private Long id;
    private String dataInicio,dataFim;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Curso curso;

    @OneToMany(mappedBy = "turma")
    private List<Matricula> matriculas;
}

