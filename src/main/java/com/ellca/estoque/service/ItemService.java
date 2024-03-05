package com.ellca.estoque.service;

import java.util.List;

import com.ellca.estoque.dominio.Item;

public interface ItemService {

	Item buscarPorId(Long id);
	
	List<Item> buscarTodos();
	
}
