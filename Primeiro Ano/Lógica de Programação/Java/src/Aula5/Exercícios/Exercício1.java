package Aula5.Exercícios;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, vezes = 0, soma = 0, maior, maior2 = 0;
        float media;

        do {
            maior = 0;
            System.out.println("Digite o primeiro número: ");
            num1 = teclado.nextInt();
            if (num1 > maior){
                maior = num1;
            }

            System.out.println("Digite o segundo número: ");
            num2 = teclado.nextInt();
            if (num2 > maior){
                maior = num2;
            }

            System.out.println("Digite o terceiro número: ");
            num3 = teclado.nextInt();
            if (num3 > maior){
                maior = num3;
            }

            System.out.println("O maior número é: " + maior);
            if (maior > maior2){
                maior2 = maior;
            }

            vezes++;
            soma = soma + maior;
        } while (num1 != num2 || num2 != num3);
        media = soma / vezes;

        System.out.println("O maior número informado foi " + maior2 + ",e a média dos números é de " + media);
    }
}
