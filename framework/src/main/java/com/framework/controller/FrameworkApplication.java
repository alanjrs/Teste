package com.framework.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.framework.model.dao.GravarParameter;
import com.framework.model.parameter.Parameter;

@Component
public class FrameworkApplication {

	
	
		
	
	


	public static void main(String[] args) {
		//SpringApplication.run(FrameworkApplication.class, args);
		
		GravarParameter g = new GravarParameter();
		g.cadastraParameter("P_TELA_CHAMADA", "String", null, 'G');
				
	}


}
