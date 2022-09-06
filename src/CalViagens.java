import java.util.Scanner;
public class CalViagens
{
    public static void main(String args[])
    {
        float peso;
        float capacidademax;
        int viagens;

        Scanner le = new Scanner(System.in);

        System.out.print("Insira o peso:");
        peso = le.nextFloat();

        System.out.print("Insira a capacidade máxima:");
        capacidademax = le.nextFloat();

        if( (peso % capacidademax) != 0)
        {
            viagens = (int) (peso / capacidademax + 1);
        }

        else
        {
            viagens = (int) (peso / capacidademax);
        }
        le.close();
        System.out.println("O total de viagens é " + viagens + ". Já que para carregar " + peso + "kg só pode levar " + capacidademax + "kg por vez.");
    }
}
