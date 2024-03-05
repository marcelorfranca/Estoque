package com.ellca.estoque.dominio;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "regioes")
@AttributeOverride(name = "id", column = @Column(name = "id_regiao")) // localiza o id correto no banco
public class Base extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 30)
	private String nome;
	
	@Column(name = "sigla", length = 10)
	private String sigla;
	
	@Column(name = "uf", length = 50)
	private String uf;

	@OneToMany(mappedBy = "base")
	private List<Funcionario> funcionario;
	
	@OneToMany(mappedBy = "base")
	private List<Requisicao> requisicao;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionario;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionario = funcionarios;
	}
		
	
	
}
