package com.formula1.tabela.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formula1.tabela.Model.Corrida;
import com.formula1.tabela.Model.Piloto;
import com.formula1.tabela.Repositório.CorridaRepository;
import com.formula1.tabela.Repositório.PilotoRepository;

@Service
public class CorridaService {

    @Autowired
    private CorridaRepository corridaRepo;

    @Autowired
    private PilotoRepository pilotoRepo;

    public Corrida criarCorrida(String nome, List<String> nomePilotos) {
        // Busca os pilotos pelo nome e atribui pontuações de acordo com a posição
        for (int i = 0; i < nomePilotos.size(); i++) {
            String nomePiloto = nomePilotos.get(i);
            Piloto piloto = pilotoRepo.findByNome(nomePiloto);  // Busca o piloto pelo nome
            if (piloto != null) {
                int pontuacao = 20 - i;  // Atribui pontuação decrescente, iniciando com 20 para o 1º lugar
                piloto.setPontuacao(piloto.getPontuacao() + pontuacao);  // Atualiza a pontuação do piloto
                pilotoRepo.save(piloto);  // Salva o piloto atualizado com a nova pontuação
            } else {
                throw new RuntimeException("Piloto com nome " + nomePiloto + " não encontrado.");
            }
        }

        // Cria a corrida com os pilotos e salva no banco de dados
        Corrida corrida = new Corrida(nome, nomePilotos);
        return corridaRepo.save(corrida);
    }
}
