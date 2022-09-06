import java.util.Scanner;

public class ArrayBidimensional1 
{
	public static void main(String[] args) 
	{
		final int ALUNOS = 5;
		final int PROVAS = 2;
		
		int linha, coluna;
		double media;
		
		double notas [][] = new double [ALUNOS][PROVAS];
		Scanner entrada = new Scanner(System.in);
		
		for(linha = 0; linha < ALUNOS; linha++)
		{
			System.out.printf("\n Digite as notas do %do aluno: ", linha+1);
			
			for(coluna = 0; coluna < PROVAS; coluna++)
				notas[linha][coluna] = entrada.nextDouble();
		}
		
		System.out.println();
		System.out.println("Notas e Média");
		
		for(linha = 0; linha < ALUNOS; linha++)
		{
			System.out.printf("\nAluno %d", linha+1);
			media = 0;
			
			for(coluna = 0; coluna < PROVAS; coluna++)
			{
				System.out.printf("%2.2f", notas[linha][coluna]);
				media += notas[linha][coluna];
			}
			
			System.out.printf(" - Media %2.2f", media/PROVAS);
		}
	}
}
