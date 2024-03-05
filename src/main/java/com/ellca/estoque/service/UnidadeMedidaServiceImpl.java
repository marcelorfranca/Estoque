package com.ellca.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ellca.estoque.dao.UnidadeMedidaDao;
import com.ellca.estoque.dominio.UnidadeMedida;

@Service
@Transactional(readOnly = false)
public class UnidadeMedidaServiceImpl implements UnidadeMedidaService {

	@Autowired
	private UnidadeMedidaDao dao;
	
	@Override 
	@Transactional(readOnly = true)
	public UnidadeMedida buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	
	@Override 
	@Transactional(readOnly = true)
	public List<UnidadeMedida> buscarTodos() {
		return dao.findAll();
	}
	
}
