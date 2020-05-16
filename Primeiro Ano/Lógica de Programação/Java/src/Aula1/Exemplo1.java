import java.util.Scanner;

public class Exemplo1
{
    public static void main(String args[])
    {
        int x, y;
        int a = 10, b = 20;
        double valor;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Número 1:");
        x = teclado.nextInt();
        System.out.print("Número 2:");
        y = teclado.nextInt();
        
        int soma = x + y;
        System.out.println("Soma de num1 e num2:" + soma + "!");
    }
}
