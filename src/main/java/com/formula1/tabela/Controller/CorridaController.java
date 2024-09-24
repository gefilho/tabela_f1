package com.formula1.tabela.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formula1.tabela.Model.Corrida;
import com.formula1.tabela.Repositório.CorridaRepository;



@RestController
@RequestMapping("/corrida")
public class CorridaController {
@Autowired CorridaRepository acao;

@PostMapping("/criar")
public Corrida criarCoriida(@RequestBody Corrida obj) {
    
    return acao.save(obj);
}

@GetMapping("/listar")
public List<Corrida> listar() {
    return (List<Corrida>) acao.findAll();
}


    
}
