package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.Funcao;

public interface FuncaoService {

    Funcao buscarPorId(Long id);
	
	List<Funcao> buscarTodos();
	
}
