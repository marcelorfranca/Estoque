package com.ellca.estoque.dominio;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Table(name = "itens")
@Entity
@AttributeOverride(name = "id", column = @Column(name = "id_item")) // código do item
public class Item extends AbstractEntity<Long> {

	@Column(name = "descricao", nullable = false, unique = true, length = 250)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo" )
	private TipoItem tipoItem;
	
	@ManyToOne
	@JoinColumn(name = "id_unidade" )
	private UnidadeMedida unidadeMedida;

	
	@OneToMany(mappedBy = "item")
	private List<Requisicao> requisicao;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoItem getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public List<Requisicao> getRequisicao() {
		return requisicao;
	}

	public void setRequisicao(List<Requisicao> requisicao) {
		this.requisicao = requisicao;
	}
		
	
	
}
