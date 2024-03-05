package com.ellca.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/atendimentos")
public class AtendimentoController {

	// aqui inserir o código para atender, uso somente do adm estoque
	
	@GetMapping("/consultar")
	public String consultar() {
		return "/atendimento/consulta";
	}
	
}
