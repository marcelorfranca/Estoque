package com.ellca.estoque.dao;

import java.util.List;

import com.ellca.estoque.dominio.Funcionario;

public interface FuncionarioDao { // não vou usar crud completo

	Funcionario findById(Long id);
	
	List<Funcionario> findAll(); 
	
}
