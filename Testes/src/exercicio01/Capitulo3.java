package exercicio01;


public class Capitulo3 {
	
	public static void main(String[] args) {
		/*
		 * Runnable r = new Runnable() {
		 * 
		 * public void run() { for (int i = 0; i <= 1000 ; i++) {
		 * 
		 * System.out.println(i);
		 * 
		 * } } };
		 */
		
	/*	Runnable r = () -> {
			
			for (int i = 0;  i<= 1000 ; i++) {
				
				System.out.println(i);
				
			}
		};
		
		new Thread(r).start();
	}*/
		
	/*
	 * new Thread(() -> { for (int i = 0; i<= 1000 ; i++) {
	 * 
	 * System.out.println(i);
	 * 
	 * } }).start();
	 */
	
	/*
	 * Validador <String> validadorCEP = new Validador<String>() { public boolean
	 * valida (String valor) { return valor.matches("[0-9]"); } };
	 */
	
		
	/*
	 * Validador <String> validadorCEP = valor -> valor.matches("[0-9]+");
	 * System.out.println(validadorCEP.valida("24315"));
	 */
	
		
	/*
	 * Runnable o = () -> { System.out.println("sss");}; System.out.println(o);
	 */
		
		
		
		int numero = 5;
		new Thread (() -> { System.out.println(numero);
		}).start();
		
	//	numero = 10;
		
	}
}
