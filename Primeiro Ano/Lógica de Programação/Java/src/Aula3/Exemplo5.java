package Aula3;

import java.util.Scanner;

public class Exemplo5 {
    public static void main (String[] args){
        Scanner teclado  = new Scanner((System.in));
        int numero;
        System.out.print("Número: ");
        numero = teclado.nextInt();

        while (numero > 100){
            System.out.println(numero);
            numero --;
        }
        System.out.println("Fim do teste!");
    }
}
