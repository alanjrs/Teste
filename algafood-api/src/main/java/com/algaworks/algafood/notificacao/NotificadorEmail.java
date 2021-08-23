package com.algaworks.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {

	/*
	 * private boolean caixaAlta; private String hostServidorSMTP;
	 */
	/*
	 * public NotificadorEmail(String hostServidorSMTP) { this.hostServidorSMTP =
	 * hostServidorSMTP; System.out.println("teste contr email"); }
	 */

	public void notificar(Cliente cliente, String mensagem) {

		/*
		 * if (this.caixaAlta) { mensagem = mensagem.toUpperCase();
		 * 
		 * }
		 */
		System.out.println("email" + cliente.getNome() + cliente.getEmail() + mensagem);
	}

	/*
	 * public void setCaixaAlta(boolean caixaAlta) { this.caixaAlta = caixaAlta; }
	 * 
	 */}
