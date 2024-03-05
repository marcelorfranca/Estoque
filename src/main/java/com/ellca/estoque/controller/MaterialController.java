package com.ellca.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ellca.estoque.dominio.Item;
import com.ellca.estoque.dominio.TipoItem;
import com.ellca.estoque.service.ItemService;
import com.ellca.estoque.service.TipoItemService;

@Controller
@RequestMapping("/materiais")
public class MaterialController {

	@Autowired
	private ItemService materialService;
	
	@Autowired
	private TipoItemService tipoItemService;
	
	@GetMapping("/consultar")
	public String consultar(ModelMap model) {
		model.addAttribute("itens", materialService.buscarTodos());
				
		return "material/consulta"; 
	}
	
	@ModelAttribute("tipoItem")
	public List<TipoItem> getTipoItem() {
		return tipoItemService.buscarTodos();
	}
	
	
	@GetMapping("/listagem") // metodo de teste, funcionou no postman
    @ResponseBody
    public List<Item> consultar() {
        return materialService.buscarTodos();
    }
}
