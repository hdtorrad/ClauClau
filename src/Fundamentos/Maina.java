package Fundamentos;

import java.io.IOException;
import java.util.Scanner;
public class Maina
{
 
    public static void main(String[] args) throws IOException 
    {
        Scanner le = new Scanner(System.in);
        int NUMBER, qntd_horas_trabalhadas;
        float ganho_hora, SALARY;
        
        NUMBER = le.nextInt();
        qntd_horas_trabalhadas = le.nextInt();
        
        ganho_hora = le.nextFloat();
    
        SALARY = qntd_horas_trabalhadas * ganho_hora;
        
        System.out.format("NUMBER = %i\nSALARY = U$%.2f\n", NUMBER, SALARY);
    }
 
}