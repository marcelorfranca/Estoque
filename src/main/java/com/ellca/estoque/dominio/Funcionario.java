package com.ellca.estoque.dominio;

import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.*;

import jakarta.validation.constraints.Email;

@SuppressWarnings("serial")
@Entity
@Table(name = "funcionarios")
@AttributeOverride(name = "id", column = @Column(name = "id_funcionario"))
public class Funcionario extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 256)
	private String nome;
		
	@CPF
	@Column(name = "cpf", length = 15)
	private String cpf;
	
	@Column(name = "matricula", length = 20)
	private String matricula;
	
	@Column(name = "operacional", length = 1)
	private String operacional; // listar somente os funcionarios operacionais
	
	@Column(name = "telefone", length = 20)
	private String telefone;
	
	@Email
	@Column(name = "email", length = 100)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "FK_SETORES_ID")
	private Setor setor;
	
	@ManyToOne
	@JoinColumn(name = "FK_REGIOES_ID")
	private Base base;
	
	@ManyToOne // uma funcao poderá ter muitos funcionarios
	@JoinColumn(name = "FK_FUNCAO_ID")
	private Funcao funcao;

	@OneToMany(mappedBy = "funcionario")
	private List<Requisicao> requisicao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getOperacional() {
		return operacional;
	}

	public void setOperacional(String operacional) {
		this.operacional = operacional;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Base getBase() {
		return base;
	}

	public void setBase(Base base) {
		this.base = base;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public List<Requisicao> getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(List<Requisicao> requisicao) {
		this.requisicao = requisicao;
	}
	
		
	
}
