package com.formula1.tabela.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formula1.tabela.Model.Equipe;
import com.formula1.tabela.Model.Piloto;
import com.formula1.tabela.Repositório.EquipeRepository;
import com.formula1.tabela.Repositório.PilotoRepository;

@Service
public class PilotoService {
    
    @Autowired
    private PilotoRepository acaoPiloto;

    @Autowired
    private EquipeRepository acaoEquipe;

    public Piloto criarPiloto(Piloto piloto, String nomeEquipe) {
        // Verifica se a equipe existe
        Optional<Equipe> equipeOptional = acaoEquipe.findByNome(nomeEquipe);

        if (equipeOptional.isPresent()) {
            // Se a equipe existir, associar o piloto a ela e salvar o piloto
            Equipe equipe = equipeOptional.get();
            piloto.setEquipe(equipe);
            return acaoPiloto.save(piloto);
        } else {
            // Se a equipe não existir, lança uma exceção ou retorna null
            throw new IllegalArgumentException("Equipe não encontrada: " + nomeEquipe);
        }
    }

    public List<Piloto> listarPiloto() {
        return acaoPiloto.findAll();
    }
}
