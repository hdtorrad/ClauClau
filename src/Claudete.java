import java.util.Scanner;



public class Claudete

{

	public static void main(String args[])

	{

		char opcao = '1';
	
		Scanner le = new Scanner(System.in);
	
		opcao = le.nextLine().charAt(0);
		System.out.println(opcao);

		le.close();
	}

}

