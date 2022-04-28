package aula06;

import java.util.Arrays;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] vet = new int[vetor.length];
        int op = 0;

        System.out.println("** Menu de opções **\n");

        while (op != 1 && op != 2 && op != 3) {
        System.out.println("1. Insertion");
        System.out.println("2. Bubble");
        System.out.println("3. Merge");
        System.out.print("R.: ");
        op = input.nextInt();
        if (op != 1 && op != 2 && op != 3) {
            System.out.println("Digite uma opção válida!\n");
            }
        }
        System.out.println();
        for (int i=0;i<vetor.length;i++) {
            System.out.print("Índice " + (i + 1) + ".: ");
            vetor[i] = input.nextInt();
        }

        switch (op) {
            case 1:
                Insertion.ordenar(vetor);
                break;
            case 2:
                Bubble.ordenar(vetor);
                break;
            case 3:
                Merge.margeSort(vetor, vet, 0, vetor.length - 1);
                //System.out.println(Arrays.toString(vetor));
            default:
                break;
        }
    }
}
