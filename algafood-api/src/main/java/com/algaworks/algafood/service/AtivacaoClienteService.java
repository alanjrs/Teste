package com.algaworks.algafood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {

	// private NotificadorEmail notificadorEmail;
	@Autowired
	private Notificador notificador;

	//@Autowired
	/*
	 * public AtivacaoClienteService(Notificador notificador) { this.notificador =
	 * notificador;
	 * 
	 * System.out.println(notificador); }
	 */

	/*
	 * public AtivacaoClienteService(String aa) { }
	 */

	public void ativar(Cliente cliente) {
		cliente.ativar();
		this.notificador.notificar(cliente, "blalalal");
	}

	//@Autowired
	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}
	
	
}
