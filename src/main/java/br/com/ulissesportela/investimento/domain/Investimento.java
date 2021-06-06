package br.com.ulissesportela.investimento.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Investimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String codigoAtivo;
	
	private Double valorCota;
	
	private Integer quantidadeCotas;
	
	private LocalDate dataCompra;
	
	@ManyToOne
	@JoinColumn(name = "fk_codigo_categoria")
	private Categoria categoria;
	
}
