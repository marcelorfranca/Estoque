package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.Base;

public interface BaseService {

	Base buscarPorId(Long id);
	
	List<Base> buscarTodos();
	
}
