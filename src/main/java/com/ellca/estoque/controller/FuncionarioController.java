package com.ellca.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

	@GetMapping("/consultar")
	public String consultar() {
		return "/funcionario/consulta";
	}
	
	
	
	
}
