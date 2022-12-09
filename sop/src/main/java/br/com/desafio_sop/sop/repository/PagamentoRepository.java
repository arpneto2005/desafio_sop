package br.com.desafio_sop.sop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio_sop.sop.model.PagamentoModel;

@Repository
public interface PagamentoRepository extends CrudRepository<PagamentoModel, Long>{
    
}
