package com.ellca.estoque.dao;

import java.util.List;

import com.ellca.estoque.dominio.Setor;

public interface SetorDao {

	Setor findById(Long id);
	
	List<Setor> findAll();
}
