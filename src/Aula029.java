import java.util.Scanner;

public class Aula029 
{
	public static void main(String[] args) 
	{
		Scanner le = new Scanner(System.in);
		
		System.out.print("Insira o seu nome: ");
		String nome = le.nextLine();
		
		System.out.print("Insira a sua idade:");
		int idade = le.nextInt();
		
		le.nextLine();
		
		System.out.println("Bem vinda a casa da Anya! Minduim?");
		var minduim = le.nextBoolean();
		
		le.close();
		
		System.out.printf("O nome dele é %s, a idade é %d + ele disse %b para o Minduim atacar!!", nome, idade, minduim);
	}
}
