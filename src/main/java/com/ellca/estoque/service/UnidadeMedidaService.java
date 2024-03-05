package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.UnidadeMedida;

public interface UnidadeMedidaService {

	UnidadeMedida buscarPorId(Long id);
	
	List<UnidadeMedida> buscarTodos();
	
	
}
