package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.TipoItem;

public interface TipoItemService {

	TipoItem buscarPorId(Long id);

	List<TipoItem> buscarTodos();

}
