package aula05;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio01 {
    public static int[] ord(int[] vetor){
        int tamanho = vetor.length;
        int comparacoes = 0;
        int trocas = 0;

        for (int i = tamanho - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                comparacoes++;
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    trocas++;
                }
            }
        }

        return vetor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetDes = new int[] {3, 0, 1, 8, 7, 2, 5, 4, 9, 6};
        int[] vetDes2 = ord(vetDes);
        System.out.println(Arrays.toString(vetDes2));
    }
}
