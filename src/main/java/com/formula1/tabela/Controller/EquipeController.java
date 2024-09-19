package com.formula1.tabela.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formula1.tabela.Model.Equipe;
import com.formula1.tabela.Repositório.EquipeRepository;


@RestController
@RequestMapping("/equipe")
public class EquipeController {
    @Autowired
    private EquipeRepository acao;

    @PostMapping("/criar")
    public Equipe criarEquipe(@RequestBody Equipe obj) {
        return acao.save(obj);
        
    }

    @GetMapping("/listar")
    public List<Equipe> listar(){
        return (List<Equipe>) acao.findAll();
    }
        
    }
    
    

