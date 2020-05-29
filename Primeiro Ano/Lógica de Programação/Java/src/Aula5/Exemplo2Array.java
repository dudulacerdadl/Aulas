package Aula5;

import java.util.Scanner;

public class Exemplo2Array {
    public static void main(String[] args) {
        int teste1[] = new int[10];
        int teste2[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < teste1.length; i++){
            System.out.println("Digite um número: ");
            teste1[i] = teclado.nextInt();
            if (i % 2 ==0 ){
                teste2[i] = teste1[i] * 5;
            } else {
                teste2[i] = teste1[i] + 5;
            }
        }

        for (int i = 0; i < teste2.length; i++){
            System.out.println("Indice: " + i + " | Número: " + teste2[i]);
        }
    }
}
