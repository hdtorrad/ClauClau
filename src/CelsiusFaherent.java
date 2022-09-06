import java.util.Scanner;
public class CelsiusFaherent
{
    public static void main(String args[])
    {
        // declaração das constantes
        final int AJUSTE = 32;
        final float FATORFTOC = 5.0f/9.0f;
        final float FATORCTOF = 1.8f;

        // declaração das variáveis
        float C, F;
        byte escolha;

        // Instanciação do objeto

        Scanner le = new Scanner(System.in);

        // escolha

        System.out.print("1.    Celsius to F\n" + "2.   F to Celsius" + "\nEscolha o que deseja converter: ");
        escolha = le.nextByte();

        if (escolha == 1)
        {
            System.out.println("\nInsira a temperatura em Cº: ");
            C = le.nextFloat();

            F = (C * FATORCTOF) + AJUSTE;

            System.out.println(C + " em Fº =" + ((C * FATORCTOF) + AJUSTE) + "\n" +F);
        }
        else if (escolha == 2)
        {
            System.out.println("Insira a temperatura em Fº: ");
            F = le.nextFloat();

            C = (F - AJUSTE) * FATORFTOC;

            System.out.println(F + " em C = " + ((F - AJUSTE) * FATORFTOC) + "\n" + C);
        }
        else
        {
            System.out.println("Opção invalida corno!!");
        }
        le.close();
    }

}