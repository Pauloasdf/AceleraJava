package com.distribuidor.remedios.Controladora;

import com.distribuidor.remedios.DTO.ProdutoDTO;
import com.distribuidor.remedios.Entidades.ProdutoEntidade;
import com.distribuidor.remedios.Servico.ProdutoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/produto")
public class ProdutoControladora {
    @Autowired
    ProdutoServico produtoServico;

    @PostMapping
    public ResponseEntity<ProdutoDTO> criarNovoProduto(@RequestBody ProdutoDTO produtoDTO){
        produtoServico.salvar(produtoDTO);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getAll() {
        List<ProdutoEntidade> list = produtoServico.listar();
        List<ProdutoDTO> listDto = list.stream().map(obj -> new ProdutoDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

       }
