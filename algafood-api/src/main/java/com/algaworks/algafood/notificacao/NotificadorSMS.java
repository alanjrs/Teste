/**
 * 
 */
package com.algaworks.algafood.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

/**
 * @author Alan Santos
 *
 */
//@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("SMS" + cliente.getNome() + cliente.getEmail() + mensagem);

	}

}
