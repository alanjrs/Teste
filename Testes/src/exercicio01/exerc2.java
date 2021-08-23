package exercicio01;

public class exerc2 {

	/**
	 * @param args
	 */
	
	static final Double  NOTA_DESCL_GERAL = 150.00;
	
	static final Double NOTA_MINIMA = 60.00;
	
	public static void main(String[] args) {
		
		
		Double [] semanaUm = new Double[] {1000.0, 2500.0};
		Double [] semanaDois = new Double[] {1000.0, 1800.0};
		
		Double [][] mes = new Double [][] {semanaUm, semanaDois};
		
		Double maiorFat = 0.0;
		Integer semanaGanh = null;
		
		for (int i = 0; i < mes.length; i++) {
			
			Double [] semana = mes[i];
			Double faturamentoSemana = 0.0;
			
			for (int j = 0; j < semana.length; j++) {
				faturamentoSemana += semana[j];
			}
			
			
			
			Boolean esseFaturEMaior = faturamentoSemana > maiorFat;
			
			
			if (esseFaturEMaior) {
				maiorFat = faturamentoSemana;
				semanaGanh = i+1;
		}
		
			
		}
		
		
		System.out.println(semanaGanh + " " + maiorFat);
	}

}
