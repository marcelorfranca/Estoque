package com.ellca.estoque.dao;

import java.util.List;

import com.ellca.estoque.dominio.Base;

public interface BaseDao {

	Base findById(Long id);
	
	List<Base> findAll();
	
	
}
