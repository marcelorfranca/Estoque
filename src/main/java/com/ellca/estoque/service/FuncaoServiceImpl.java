package com.ellca.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ellca.estoque.dao.FuncaoDao;
import com.ellca.estoque.dominio.Funcao;

@Service
@Transactional(readOnly = false)
public class FuncaoServiceImpl implements FuncaoService {

	@Autowired
	private FuncaoDao dao;
	
	@Override 
	@Transactional(readOnly = true)
	public Funcao buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Override 
	@Transactional(readOnly = true)
	public List<Funcao> buscarTodos() {
		return dao.findAll();
	}
	
}
