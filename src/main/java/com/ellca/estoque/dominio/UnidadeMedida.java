package com.ellca.estoque.dominio;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Table(name = "unidades")
@Entity
@AttributeOverride(name = "id", column = @Column(name = "id_unidade"))
public class UnidadeMedida extends AbstractEntity<Long> {

	@Column(name = "descricao", nullable = true, unique = true, length = 20)
	private String descricao;
		
	@Column(name = "sigla", nullable = false, unique = false, length = 2)
	private String sigla;

	@OneToMany(mappedBy = "unidadeMedida")
	private List<Item> item;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	
	
}
