package aula02;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetorImpar = new int[10];
        int[] vetorPar = new int[10];
        int cont1 = 0;
        int cont2 = 0;

        System.out.println("Digite 10 valores");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print((i + 1) + "º Valor: " );
            vetor1[i] = input.nextInt();

            if (vetor1[i] % 2 == 0) {
                vetorPar[cont1] = vetor1[i] * 5;
                cont1 ++;
            } else {
                vetorImpar[cont2] = vetor1[i] + 5;
                cont2 ++;
            }
        }

        System.out.println("Os números indicados foram: " + Arrays.toString(vetor1));
        System.out.println("Os números pares indicados ficaram: " + Arrays.toString(vetorPar));
        System.out.println("Os números ímpares indicados ficaram: " + Arrays.toString(vetorImpar));
    }
}
