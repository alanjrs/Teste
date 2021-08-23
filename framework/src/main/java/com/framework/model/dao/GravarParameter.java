package com.framework.model.dao;

import org.springframework.stereotype.Component;

import com.framework.model.parameter.Parameter;

@Component
public class GravarParameter {
	
	Parameter parameter;
	
	
	public GravarParameter(Parameter parameter) {
		this.parameter = parameter;
	}

	public GravarParameter() {
		super();
	}

	public void cadastraParameter(String nome, String tipo, String valorInicial, char contexto) {
		
		parameter.setContexto(contexto);
		parameter.setNome(nome);
		parameter.setTipo(tipo);
		parameter.setValorInicial(valorInicial);
		
		System.out.println(parameter.getNome());
		
		
	}

}
