package com.formula1.tabela.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Corrida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;  // Nome da corrida

    @ElementCollection
    @Column(name = "nome_piloto")
    private List<String> pilotos;  // Nomes dos pilotos na corrida, ordenados pela posição

    // Construtores
    public Corrida() {}

    public Corrida(String nome, List<String> pilotos) {
        this.nome = nome;
        this.pilotos = pilotos;
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getPilotos() {
        return pilotos;
    }

    public void setPilotos(List<String> pilotos) {
        this.pilotos = pilotos;
    }
}
