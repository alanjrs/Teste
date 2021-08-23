package com.algaworks.algafood;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.NotificadorSMS;
import com.algaworks.algafood.service.AtivacaoClienteService;

public class Main {
	
	
    public static void main(String[] args) {
	
    	Cliente joao = new Cliente ("joao", "ddd@dd", "21313");
    	Cliente maria = new Cliente ("maria", "aaa@dd", "99921313");
    	
    	Notificador notificador = new NotificadorSMS();
    	//AtivacaoClienteService ativacaoClienteService2 = new AtivacaoClienteService(notificador);
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
    	ativacaoClienteService.ativar(joao);
    	ativacaoClienteService.ativar(maria);

    	
	}
   

}
