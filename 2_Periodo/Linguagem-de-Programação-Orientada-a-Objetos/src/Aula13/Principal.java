package Aula13;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matriz[][] = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor para a linha " + (i+1) + ", coluna " + (j+1) + ": ");
                matriz[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor na linha " + (i+1) + ", coluna " + (j+1) + " é igual " + matriz[i][j]);
            }
        }

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][1];
        }
        System.out.println("Soma da segunda coluna: " + soma);

        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[2][i];
        }
        System.out.println("Soma da terceira linha: " + soma);

        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println("Soma de todos os números: " + soma);

        int media = soma / matriz.length;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > media) {
                    System.out.print("Valor na linha " + (i+1) + ", coluna " + (j+1) + " é igual " + matriz[i][j]);
                }
            }
        }

        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        System.out.println("Coma da diagonal principal: " + soma);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] = matriz[i][j] * 2;
                }
            }
        }
    }
}
