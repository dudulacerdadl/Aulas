package Primeiro_Semestre.Aula4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 0, vezes = 0, sorteio;

        sorteio = 1+(int)(Math.random() * 10000);
        for (int i = 0; i < 20; i++){
            System.out.println("Digite um número entre 1 e 10.000: ");
            num = leia.nextInt();
            vezes ++;

            if (num < 1 || num > 10000){
                while (num < 1 || num > 10000){
                    System.out.println("[ERRO] Digite um número válido!");
                    num = leia.nextInt();
                }
            }

            if (num > sorteio) {
                System.out.println("Tente um número menor!");
            } else if (num < sorteio){
                System.out.println("Tente um número maior!");
            } else {
                System.out.println("Parabéns! Você ganhou utilizando " + vezes + " tentativas!!");
                break;
            }
            System.out.println(sorteio);
        }
        if (num != sorteio) {
            System.out.println("Infelizmente não foi dessa vez!");
        }
    }
}