package com.formula1.tabela.Model;

import java.util.List;

public class Temporada {

    private int pontuacaoPiloto;
    private int pontuacaoEquipe;

    // Método para calcular a pontuação de um piloto
    public void calcularPontuacaoPiloto(List<Piloto> pilotos) {
        this.pontuacaoPiloto = pilotos.stream().mapToInt(Piloto::getPontuacao).sum();
    }

    // Método para calcular a pontuação da equipe
    public void calcularPontuacaoEquipe(List<Piloto> pilotos, String nomeEquipe) {
        this.pontuacaoEquipe = pilotos.stream()
            .filter(piloto -> piloto.getEquipe().getNome().equals(nomeEquipe))
            .mapToInt(Piloto::getPontuacao)
            .sum();
    }

    // Getters e setters
    public int getPontuacaoPiloto() {
        return pontuacaoPiloto;
    }

    public void setPontuacaoPiloto(int pontuacaoPiloto) {
        this.pontuacaoPiloto = pontuacaoPiloto;
    }

    public int getPontuacaoEquipe() {
        return pontuacaoEquipe;
    }

    public void setPontuacaoEquipe(int pontuacaoEquipe) {
        this.pontuacaoEquipe = pontuacaoEquipe;
    }
}
