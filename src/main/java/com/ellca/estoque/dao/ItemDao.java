package com.ellca.estoque.dao;

import java.util.List;

import com.ellca.estoque.dominio.Item;

public interface ItemDao {

	Item findById(Long id);
	
	List<Item> findAll();
	
}
