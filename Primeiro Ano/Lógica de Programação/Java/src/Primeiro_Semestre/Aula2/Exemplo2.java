package Primeiro_Semestre.Aula2;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;

        for(int i = 1; i <= 10; i++){
            System.out.print("Número:");
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                System.out.println("É par");
            } else {
                System.out.println("É ímpar");
            }
        }
    }
}