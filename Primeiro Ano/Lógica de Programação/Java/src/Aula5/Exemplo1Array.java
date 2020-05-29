package Aula5;

import java.util.Scanner;

public class Exemplo1Array {
    public static void main(String[] args) {
        double valores[] = new double[10];
        double soma = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++){
            System.out.println("Digite um número: ");
            valores[i] = teclado.nextDouble();
            soma = soma + valores[i];
        }
        System.out.println("Média: " + (soma / valores.length));

        double numeros [] = {10.5, 34, 66.77, 4};
        System.out.println("Tamanho do Array: " + numeros.length);
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Indice: " + i + " | Número: " + numeros[i]);
        }
    }
}
