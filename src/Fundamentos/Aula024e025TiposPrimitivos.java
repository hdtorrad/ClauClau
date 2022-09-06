package Fundamentos;

public class Aula024e025TiposPrimitivos 
{
	public static void main(String[] args) 
	{
//		tipos inteiros
		byte idade = 17;
		short vendas = 130;
		int id = 1254789;
		long pontos = 3_258_369l;
		
//		tipos reais
		float saldo = 372.16f;
		double reais_gastos = 6_854_369.25896;
		
//		boleano
		boolean ativo = true;
		
//		caracter
		char nome = "Humberto".charAt(0);
		
		System.out.println("Idade: " + idade
				+ "\nVendas: " + vendas
				+ "\nID: " + id
				+ "\nPontos: " + pontos 
				+ "\nSaldo: " + saldo
				+ "\nReais gastos: " + reais_gastos
				+ "\nAtivo: " + ativo
				+ "\nNome: " + nome);
	}
}
