package com.ellca.estoque.dao;

import java.util.List;

import com.ellca.estoque.dominio.Requisicao;

public interface RequisicaoDao {

	void save(Requisicao requisicao);
		
	void update(Requisicao requisicao);
	
	void delete(Long id);
	
	Requisicao findById(Long id);
	
	List<Requisicao> findAll();
	
	
}
