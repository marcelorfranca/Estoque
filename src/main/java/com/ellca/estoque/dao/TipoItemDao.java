package com.ellca.estoque.dao;

import java.util.List;

import com.ellca.estoque.dominio.TipoItem;

public interface TipoItemDao {

	TipoItem findById(Long id);
	
	List<TipoItem> findAll();
	
}
