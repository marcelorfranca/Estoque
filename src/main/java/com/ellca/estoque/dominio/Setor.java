package com.ellca.estoque.dominio;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "setores")
@AttributeOverride(name = "id", column = @Column(name = "id_setor")) // localiza o id correto no banco
public class Setor extends AbstractEntity<Long> {

	
	@Column(name = "descricao", nullable = false, unique = true, length = 30)
	public String descricao;

	@Column(name = "estoque", length = 1)
	public String estoque;
	
	public String getDescricao() {
		return descricao;
	}

	@OneToMany(mappedBy = "setor")
	private List<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "setor")
	private List<Requisicao> requisicao;
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEstoque() {
		return estoque;
	}

	public void setEstoque(String estoque) {
		this.estoque = estoque;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Requisicao> getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(List<Requisicao> requisicao) {
		this.requisicao = requisicao;
	}
		
	
}
