public class IntroducaoArray1 
{
	//método principal
	public static void main(String[] args) 
	{
		//declarando uma constante
		final int TAMANHO = 10;
		
		//declaração do array
		int numero[] = new int[TAMANHO];
		
		for(int cont = 0; cont < TAMANHO; cont++)
			numero[cont] = 2 + 2 * cont;
		
		//imprimindo títulos das colunas
		System.out.printf("%s %8s \n", "Indice", "Valor");
		
		//descobrindo quantas posições tem nossos arrays
		for(int cont = 0; cont < TAMANHO; cont++)
			System.out.printf("%6d %8d \n", cont, numero[cont]);
	}
}
