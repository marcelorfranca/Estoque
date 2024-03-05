package com.ellca.estoque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ellca.estoque.dao.RequisicaoDao;
import com.ellca.estoque.dominio.Requisicao;

@Service
@Transactional(readOnly = false)
public class RequisicaoServiceImpl implements RequisicaoService {
	
	@Autowired
	private RequisicaoDao dao;
	
	@Override
	public void salvar(Requisicao requisicao) {
		dao.save(requisicao);
		
	}

	@Override
	public void editar(Requisicao requisicao) {
		
		dao.update(requisicao);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Requisicao buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Requisicao> buscarTodos() {
		
		return dao.findAll();
	}

}
