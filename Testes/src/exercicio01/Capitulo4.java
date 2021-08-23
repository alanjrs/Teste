package exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Capitulo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario user1 = new Usuario("paulo", 150);
		Usuario user2 = new Usuario("marco", 120);
		Usuario user3 = new Usuario("saulo", 190);

		
		/*
		 * List<Usuario> usuarios = Arrays.asList(user1,user2,user3);
		 * 
		 * Consumer<Usuario> mostraMensagem = u -> System.out.println("---");
		 * 
		 * Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
		 * 
		 * usuarios.forEach(imprimeNome.andThen(mostraMensagem));
		 */
		
		
		
		Predicate <Usuario> predicado = new Predicate<Usuario>(){
			public boolean test (Usuario u) {
				return u.getPontos() > 160;
			}
		};
		
		List <Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		//usuarios.removeIf(predicado);
		
		usuarios.removeIf(u -> u.getPontos() > 160);
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		
		
		
	}

}
