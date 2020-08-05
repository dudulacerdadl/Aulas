package Primeiro_Semestre.Aula3;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Número: ");
            numero = entrada.nextInt();
        } while (numero != 44);
        System.out.println("Fim do teste do..while");
    }
}
