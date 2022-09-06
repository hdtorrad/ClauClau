import java.util.Scanner;

public class Exercicio7
{
	public static void main(String[] args) 
	{
		int tamanho;
		int i, j;
		
		Scanner le = new Scanner(System.in);
		
		tamanho = le.nextInt();
		
		for(i = tamanho; i > 0; i --)
		{
			for(j = tamanho; j > 0; j--)
			{
				System.out.printf( j % 2 == 0 ? "O" : "X" );
			}
			System.out.println("");
		}
	}
}
