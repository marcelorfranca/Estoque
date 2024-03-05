package com.ellca.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ellca.estoque.dao.SetorDao;
import com.ellca.estoque.dominio.Setor;

@Service
@Transactional(readOnly = false)
public class SetorServiceImpl implements SetorService {

	@Autowired
	private SetorDao dao;
	
	@Override 
	@Transactional(readOnly = true)
	public Setor buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Override 
	@Transactional(readOnly = true)
	public List<Setor> buscarTodos() {
		return dao.findAll();
	}
	
}
