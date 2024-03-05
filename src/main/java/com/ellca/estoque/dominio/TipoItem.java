package com.ellca.estoque.dominio;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "tipo_itens")
@Entity
@SuppressWarnings("serial")
@AttributeOverride(name = "id", column = @Column(name = "id_tipo"))
public class TipoItem extends AbstractEntity<Long> {

	@Column(name = "descricao", nullable = false, unique = true, length = 20)
	private String descricao;

	@OneToMany(mappedBy = "tipoItem")
	private List<Item> item;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
		
	
	
}
