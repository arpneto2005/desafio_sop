package br.com.desafio_sop.sop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio_sop.sop.model.DespesaModel;
import br.com.desafio_sop.sop.service.DespesaService;

@RestController
public class Despesa {

    @Autowired
    private DespesaService ds;

    @GetMapping("/despesa/listar")
    public Iterable<DespesaModel> listar(){
        return ds.listar();
    }

    @PostMapping("/despesa/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DespesaModel dm){
        return ds.cadastrar(dm);
    }

    @GetMapping("/despesa/teste")
    public String teste(){
        return "OK";
    }
}
