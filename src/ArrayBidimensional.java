public class ArrayBidimensional 
{
	public static void main(String[] args) 
	{
		//criando um array de uma dimensão
		String[] uma = {"Ricardo", "Sandra"};
		
		//acessando elemento Ricardo no array unidimensional
		System.out.println(uma[0]);
		
		//criando um array bidimensional
		String [][] duas = { {"Ricardo", "M", "DF"}, {"Sandra", "F", "MG"} };
		
		//acessando elementos no array bidimensional
		System.out.println(duas [0][0]);  //buscando elemento Ricardo
		System.out.println(duas [1][0]);  //buscando elemento Sandra
		
		//como descubro quantos elementos tenho na minha primeira dimensão
		//primeiro cochete representa o primeiro nível do array
		System.out.println(duas.length);
		
		//quantos elementos tem dentro do array interno
		System.out.println(duas[0].length);
		
		//como alterar valores de um array de vários dimensões
		duas[1][0] = "ALESSANDRA";
		
		//exibindo resultado
		System.out.println(duas[1][0]);
	}
}
