package Fundamentos;

import javax.swing.JOptionPane;

public class Aula023Inferencia 
{
	public static void main(String[] args) 
	{
		//Uso de var para declara variaveis que não se sabe o tipo
		//Deve ser declarada e inicializada na mesma linha.
		
		var a = JOptionPane.showInputDialog("Insira algo que lhe falaremos o tipo da variavel!").trim();
		
		if(a.matches("[A-Z]*") || a.trim().matches("[a-z]*"))
		{
			//Como a já é String é só exibir isso
			JOptionPane.showMessageDialog(null,"'" + a + "' é uma String.");
		}
		else if (a.matches("[0-9]*"))
		{
			var b = Long.parseLong(a);
			JOptionPane.showMessageDialog(null,"'" + b + "' é um número inteiro.");
		}
		else if (a.matches("[0.0-9.9]*")) 
		{
			var c = Double.parseDouble(a);
			JOptionPane.showMessageDialog(null,"'" + c + "' é um número real.");
		}
		
	}
}
