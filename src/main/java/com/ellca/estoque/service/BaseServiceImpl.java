package com.ellca.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ellca.estoque.dao.BaseDao;
import com.ellca.estoque.dominio.Base;

@Service
@Transactional(readOnly = false)
public class BaseServiceImpl implements BaseService {

	@Autowired
	private BaseDao dao;
	
	@Override 
	@Transactional(readOnly = true)
	public Base buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Override 
	@Transactional(readOnly = true)
	public List<Base> buscarTodos() {
		return dao.findAll();
	}
	
	
}
