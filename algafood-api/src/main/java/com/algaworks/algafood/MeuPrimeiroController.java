package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	
	
	
	 public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
	 
	 this.ativacaoClienteService = ativacaoClienteService;
	
	  System.out.println("contr prim contro"); }
	



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("joao", "dd@dd", "1313131");
		ativacaoClienteService.ativar(joao);
		return "hello";
	}
	

}
