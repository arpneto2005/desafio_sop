package br.com.desafio_sop.sop.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Despesa")
@Getter
@Setter
public class DespesaModel {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    private int numero_protocolo;
    @NotBlank
    private String tipo_despesa;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data_protocolo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data_vencimento;
    @NotBlank
    private String credor_despesa;
    @NotBlank
    private String descricao_despesa;
    @NotNull
    private double valor_despesa;

    @ManyToOne
    private EmpenhoModel empenhoModel;
}
