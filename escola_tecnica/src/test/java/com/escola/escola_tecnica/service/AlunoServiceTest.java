package com.escola.escola_tecnica.service;

import com.escola.escola_tecnica.Domain.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoServiceTest {

    @Test
    public void salvaAlunoComSucesso(){
        //inputs
            Aluno esperado = new Aluno('José','123456','08/08/1995','51999999999');
        //execution
            AlunoService alunoService = new AlunoService(alunoRepository);
            Aluno atual = alunoService.salvar(aluno);
        //verification
        assertEquals(esperado,atual);
    }

}
