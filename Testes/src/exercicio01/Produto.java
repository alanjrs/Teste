package exercicio01;

public class Produto {
	
	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

	
	String nome;
	Integer quantidadeEstoque;
	
	Boolean eNecessário() {
		if (quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
	
}
