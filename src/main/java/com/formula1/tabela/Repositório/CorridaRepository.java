package com.formula1.tabela.Repositório;

import org.springframework.data.repository.CrudRepository;

import com.formula1.tabela.Model.Corrida;

public interface CorridaRepository extends CrudRepository<Corrida, Integer>   {
    
}