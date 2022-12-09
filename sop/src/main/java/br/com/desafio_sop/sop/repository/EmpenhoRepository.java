package br.com.desafio_sop.sop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio_sop.sop.model.EmpenhoModel;

@Repository
public interface EmpenhoRepository extends CrudRepository <EmpenhoModel, Long> {
    
}
