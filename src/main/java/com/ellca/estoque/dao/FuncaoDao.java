package com.ellca.estoque.dao;

import java.util.List;

import com.ellca.estoque.dominio.Funcao;

public interface FuncaoDao {

	Funcao findById(Long id);
	
	List<Funcao> findAll();
	
}
