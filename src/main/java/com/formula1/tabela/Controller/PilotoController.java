package com.formula1.tabela.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formula1.tabela.Model.Piloto;
import com.formula1.tabela.Service.PilotoService;

@RestController
@RequestMapping("/piloto")
public class PilotoController {
    @Autowired
    private PilotoService acao;

    @PostMapping("/criar")
    public Piloto criarPiloto(@RequestBody Map<String, Object> pilotoData) {
        String nomeEquipe = (String) pilotoData.get("nomeEquipe");
        Piloto piloto = new Piloto();
        piloto.setNumero((Integer) pilotoData.get("numero"));
        piloto.setNome((String) pilotoData.get("nome"));
        piloto.setPais((String) pilotoData.get("pais"));

        return acao.criarPiloto(piloto, nomeEquipe);
    }

    @GetMapping("/listar")
    public List<Piloto> listar() {
        return acao.listarPiloto();
    }
}

