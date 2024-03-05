package com.ellca.estoque.dominio;

import java.util.List;

import jakarta.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "funcoes")
@AttributeOverride(name = "id", column = @Column(name = "id_funcao")) // muda o nome do id da classe herdada
public class Funcao extends AbstractEntity<Long> {
	
	@OneToMany(mappedBy = "funcao") // muitos funcionario para uma função
	private List<Funcionario> funcionarios;
	
	
	@Column(name = "descricao", nullable = false, unique = true, length = 50)
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
}
