package com.formula1.tabela.Repositório;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formula1.tabela.Model.Corrida;

@Repository
public interface CorridaRepository extends CrudRepository<Corrida, Long> {
    // Métodos padrões do CRUD estão disponíveis
}
