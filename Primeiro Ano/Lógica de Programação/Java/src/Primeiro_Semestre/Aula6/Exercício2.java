package Primeiro_Semestre.Aula6;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        int pesquisa [] = new int[20];
        int total[] = new int[6];
        Scanner leia = new Scanner(System.in);
        for (int i = 0; i < pesquisa.length; i++){
            System.out.println("Nota: ");
            pesquisa[i] = leia.nextInt();

            total[pesquisa[i]]++;
        }
        for (int i = 1; i < total.length; i++){
            System.out.println("Total nota " + 1 + " " + total[i]);
        }
    }
}
