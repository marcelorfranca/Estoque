package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.Setor;

public interface SetorService {

	Setor buscarPorId(Long id);

	List<Setor> buscarTodos();

}
