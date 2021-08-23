package exercicio01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario ("Alan", 150);
		Usuario user2 = new Usuario ("Joao", 150);
		Usuario user3 = new Usuario ("Marcio", 150);
		
		List<Usuario> usuarios = Arrays.asList(user1,user2, user3);
		
		/*
		 * for (Usuario u: usuarios) { System.out.println(u.getNome()); }
		 */
		
		/*Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);
		
		usuarios.forEach(new Consumer<Usuario>(){

		
			public void accept(Usuario u) {
				System.out.println("---");
				
				System.out.println(u.getNome());
			}
			
		
		});*/
		
		
		//Consumer <Usuario> mostrador = (Usuario u) -> {System.out.println(u.getNome());}; {
		/*
		 * Consumer <Usuario> mostrador = (Usuario u) -> {
		 * System.out.println(u.getNome());
		 * 
		 * };
		 */
		//Consumer <Usuario> mostrador = u -> {System.out.println(u.getNome());};
		//Consumer <Usuario> mostrador = u -> System.out.println(u.getNome());
		usuarios.forEach(u -> System.out.println(u.getNome()));
		usuarios.forEach(u -> u.tornatModerador());
	}
		
	}
	

