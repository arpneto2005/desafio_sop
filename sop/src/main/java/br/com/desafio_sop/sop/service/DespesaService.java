package br.com.desafio_sop.sop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.desafio_sop.sop.model.DespesaModel;
import br.com.desafio_sop.sop.model.RespostaModel;
import br.com.desafio_sop.sop.repository.DespesaRepository;

@Service
public class DespesaService {
    
    @Autowired
    private DespesaRepository dr;

    @Autowired
    private RespostaModel rm;

    public ResponseEntity<?> cadastrar(DespesaModel dm){
        
        return new ResponseEntity<DespesaModel> (dr.save(dm), HttpStatus.CREATED);
    }

    public Iterable<DespesaModel> listar(){
        return dr.findAll();
    }
}
