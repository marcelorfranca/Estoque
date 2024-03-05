package com.ellca.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requisicoes")
public class RequisicaoController {

	@GetMapping("/criar")
	public String criar() {
		return "/requisicao/cadastro";
	}
	
	@GetMapping("/consultar")
	public String consultar() {
		return "/requisicao/consulta";
	}
	
}
