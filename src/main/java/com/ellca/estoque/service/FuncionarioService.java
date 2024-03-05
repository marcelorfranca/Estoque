package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.Funcionario;

public interface FuncionarioService {

	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();
	
}
