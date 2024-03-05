package com.ellca.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ellca.estoque.dao.TipoItemDao;
import com.ellca.estoque.dominio.TipoItem;

@Service
@Transactional(readOnly = false)
public class TipoItemServiceImpl implements TipoItemService {

	@Autowired
	private TipoItemDao dao;
	
	@Override 
	@Transactional(readOnly = true)
	public TipoItem buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Override 
	@Transactional(readOnly = true)
	public List<TipoItem> buscarTodos() {
		return dao.findAll();
	}

	
}
