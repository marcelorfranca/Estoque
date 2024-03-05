package com.ellca.estoque.dominio;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

@Entity
@SuppressWarnings("serial")
@Table(name = "requisicoes")
public class Requisicao extends AbstractEntity<Long> {

	@Column(name = "quantidade")
	private Integer quantidade;
	
	@NotNull(message="Informe a data.")
	@Column(name = "data", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate data; 
	
	@Column(name = "hora", nullable = false, length = 8 )
	private String hora;
	
	@Column(name = "requisicao", nullable = false)
	private Integer nro_Requisicao;
	
	@Column(name = "motivo", length = 100)
	private String motivo;
	
	@Column(name = "rastreabilidade", length = 30)
	private String rastreabilidade;
	
	@Column(name = "atendido", length = 1)
	private String atendido;
	
	@Column(name = "status", length = 20)
	private String status;
	
	@Column(name = "estoque", length = 30 )
	private String estoque; 
	
	@NotNull(message = "Selecione um Item.")
	@ManyToOne
	@JoinColumn(name = "id_item")
	private Item item;
	
	@NotNull(message = "Selecione a Base.")
	@ManyToOne
	@JoinColumn(name = "id_regiao")
	private Base base;
	
	@NotNull(message = "Selecione o Setor.")
	@ManyToOne
	@JoinColumn(name = "id_setor")
	private Setor setor;
	
	@NotNull(message = "Selecione um funcionário.")
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;
	
	
	
	
}
