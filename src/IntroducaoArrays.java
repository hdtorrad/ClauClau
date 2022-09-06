public class IntroducaoArrays
{
	
	//método principal
	public static void main(String[] args) 
	{
		//declaração do array
		int numero[];
		
		//instanciando e alocando espaço para array
		numero = new int [5];
		
		//imprimindo títulos fas colunas
		System.out.printf("%s %6s \n", "Indice", "Valor");
		
		//
		for(int cont = 0; cont < numero.length; cont++)
			//descobrindo quantas posições tem os nossos arrays
			System.out.printf("%6d %6d \n", cont, numero[cont]);
		
		System.exit(0);
	}
}
