package aula11;

import java.util.Arrays;

public class prova {
    public static int[] teste (int[] vetor) {
        int i, j, atual;
        for (i = 1; i < vetor.length; i++) {
            atual = vetor[i];
            j = i;
            while ((j > 0 ) && (vetor[j - 1] > atual)) {
                vetor[j] = vetor[j - 1];
                j --;
            }
            vetor[j] = atual;
        }
        return vetor;
    }

    public static void main(String[] args) {
        int[] vetor = {5, 3, 1, 2, 4};
        System.out.println(Arrays.toString(teste(vetor)));
    }
}
