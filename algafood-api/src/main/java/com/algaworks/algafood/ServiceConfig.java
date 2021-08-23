package com.algaworks.algafood;

import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.service.AtivacaoClienteService;


//@Configuration
public class ServiceConfig {
	
	//@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
