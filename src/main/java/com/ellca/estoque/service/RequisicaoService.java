package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.Requisicao;

public interface RequisicaoService {

	void salvar(Requisicao requisicao);
	
	void editar(Requisicao requisicao);
	
	void excluir(Long id);
	
	Requisicao buscarPorId(Long id);
	
	List<Requisicao> buscarTodos();
	
}
