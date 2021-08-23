package exercicio01;

import java.util.Iterator;

public class ListaAlunos {

	static final int QUANTIADE_LISTA = 2;
	Aluno[] lista = new Aluno[QUANTIADE_LISTA];
	
	int tamanhoLista = 0;
	
	
	Aluno obter(int indice) {
		return lista[indice];
	}
	
	int tamanho() {
		return tamanhoLista;
	}
	
	void adicionar(Aluno aluno) {
		
		if (lista.length == tamanhoLista) {
			
			Aluno[] novaLista = new Aluno[QUANTIADE_LISTA + lista.length];
			
			for (int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
				
			}
			
			
			
			lista = novaLista;
			
			
		}
		
		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
	
	
	void remover (Aluno aluno) {
		for (int i = 0; i < tamanhoLista; i++) {
			
			Aluno a = lista[i];
			
			if (a!= null && a.equals(aluno)) {
				remover(i);
			} else if (a == null && aluno == null){
				remover (i);
			}
		}
	}
	
	void remover (int indice){
		
		int indiceAcimaParaRemover = indice + 1;
		
		for (int i = indiceAcimaParaRemover; i < tamanhoLista; i++) {
			
			lista[i - 1] = lista[i];		
		}
		
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
}
