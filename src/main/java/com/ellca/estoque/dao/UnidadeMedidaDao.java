package com.ellca.estoque.dao;

import java.util.List;
import com.ellca.estoque.dominio.UnidadeMedida;

public interface UnidadeMedidaDao {

	UnidadeMedida findById(Long id);
	
	List<UnidadeMedida> findAll();
	
	
}
