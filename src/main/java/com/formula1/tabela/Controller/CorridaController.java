package com.formula1.tabela.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formula1.tabela.Model.Corrida;
import com.formula1.tabela.Service.CorridaService;

@RestController
@RequestMapping("/corrida")
public class CorridaController {

    @Autowired
    private CorridaService corridaService;

    @PostMapping("/criar")
    public Corrida criarCorrida(@RequestBody Map<String, Object> corridaData) {
        String nomeCorrida = (String) corridaData.get("nome");
        List<String> nomePilotos = (List<String>) corridaData.get("pilotos");//pilotos por orden  de chegada

        return corridaService.criarCorrida(nomeCorrida, nomePilotos);
    }
}
