package br.com.desafio_sop.sop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pagamento {
    
    @GetMapping("/pagamento/teste")
    public String teste(){
        return "OK";
    }
}
