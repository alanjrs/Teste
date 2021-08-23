package com.framework.model.parameter;

import org.springframework.stereotype.Component;

@Component
public class Parameter {
	
	private String nome;
	private String valorInicial;
	private String tipo;
	private char contexto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(String valorInicial) {
		this.valorInicial = valorInicial;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public char getContexto() {
		return contexto;
	}
	public void setContexto(char contexto) {
				
		this.contexto = contexto;
	}
	
	
	

}
