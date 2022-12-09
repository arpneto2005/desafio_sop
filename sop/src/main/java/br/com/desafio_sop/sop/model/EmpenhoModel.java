package br.com.desafio_sop.sop.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Empenho")
@Getter
@Setter
public class EmpenhoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ano_empenho;
    private String numero_empenho;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data_empenho;
    @NotNull
    private Double valor_empenho;
    private String observacao;

    @ManyToOne
    private PagamentoModel pagamento;

    @OneToOne
    private DespesaModel despesa;
}
