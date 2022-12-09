package br.com.desafio_sop.sop.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Pagamento")
@Getter
@Setter
public class PagamentoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    private int ano_pagamento;
    @NotBlank
    private String numero_pagamento;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data_pagamento;
    @NotNull
    private Double valor_pagamento;
    private String observacao;

    @OneToOne
    private EmpenhoModel empenho;
}
