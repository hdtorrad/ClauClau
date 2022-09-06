public class IntroducaoArray2 
{
	//método principal
	public static void main(String[] args) 
	{
		//declaração arrays
		int diasDoMes[] = {0, 31,28,31,30,32,31,30,31,30,31,30,31};
		
		String meses[] = {"","Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
		
		//Exibindo proposta da classe
		System.out.printf("Programa exibe os Meses de Um ano e a quantidade de dias \n");
		
		//imprimindo títulos das colunas
		System.out.printf("%s %9s", "Mes", "Dias");
		
		//
		for(int cont = 1; cont < diasDoMes.length; cont++)
			//descobrindo quantas posições tem os nossos arrays
			System.out.printf("%2d (%3s) %4d\n", cont, meses[cont], diasDoMes[cont]);
		
		System.exit(0);
	}

}
