package com.escola.escola_tecnica.Domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name,descricao,requitos,modalidade;

    @OneToMany(mappedBy = "curso")
    private List<Turma> turmas;
}
