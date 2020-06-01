package Aula6;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        int vezes = 0;
        int lista[] = new int[15];
        int posicao[] = new int[15];
        Scanner leia = new Scanner(System.in);

        for (int i =0; i < lista.length; i++){
            System.out.println("Digite um número: ");
            lista[i] = leia.nextInt();
            if (lista [i] == 30){
                posicao[vezes] = i;
                vezes ++;
            }
        }
        System.out.println("Foram digitados " + vezes + " números 30.");
        if (posicao[0] == 0){
            System.out.println("Foi encontrado na posição: 0");
        }
        for (int i = 0; i < posicao.length; i++){
            if (posicao[i] != 0) {
                System.out.println("Foi encontrado na posição: " + posicao[i]);
            }
        }
    }
}
