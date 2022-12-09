package br.com.desafio_sop.sop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio_sop.sop.model.EmpenhoModel;
import br.com.desafio_sop.sop.model.RespostaModel;
import br.com.desafio_sop.sop.repository.EmpenhoRepository;

@Service
public class EmpenhoService {

    @Autowired
    private EmpenhoRepository er;

    @Autowired
    private RespostaModel rm;

    public Iterable<EmpenhoModel> listar(){
        return er.findAll();
    }
    
}
