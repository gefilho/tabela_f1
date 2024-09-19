package com.formula1.tabela.Repositório;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formula1.tabela.Model.Equipe;

@Repository
public interface EquipeRepository extends CrudRepository<Equipe, Integer> {

   List<Equipe> findAll();


   Optional<Equipe> findByNome(String nome);

}
