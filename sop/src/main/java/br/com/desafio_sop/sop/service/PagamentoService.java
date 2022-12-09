package br.com.desafio_sop.sop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio_sop.sop.model.PagamentoModel;
import br.com.desafio_sop.sop.model.RespostaModel;
import br.com.desafio_sop.sop.repository.PagamentoRepository;

@Service
public class PagamentoService {
    
    @Autowired
    private PagamentoRepository pr;

    @Autowired
    private RespostaModel rm;

    public Iterable<PagamentoModel> listar(){
        return pr.findAll();
    }
}
