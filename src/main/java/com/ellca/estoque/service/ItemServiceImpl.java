package com.ellca.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ellca.estoque.dao.ItemDao;
import com.ellca.estoque.dominio.Item;

@Service
@Transactional(readOnly = false)
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao dao;
	
	@Override 
	@Transactional(readOnly = true)
	public Item buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Override 
	@Transactional(readOnly = true)
	public List<Item> buscarTodos() {
		return dao.findAll();
	}
	
}
