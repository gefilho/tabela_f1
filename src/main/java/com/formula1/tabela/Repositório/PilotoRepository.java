package com.formula1.tabela.Repositório;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.formula1.tabela.Model.Piloto;

@Repository
public interface PilotoRepository extends CrudRepository <Piloto, Integer> {

    List<Piloto> findAll();


}
