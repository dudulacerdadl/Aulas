package aula04;

import java.util.Arrays;

public class ex01 {
    public static void ord(int[] vetor) {
        int aux,j;
        int comparacoes = 0;
        int trocas = 0;
        for (int i=1;i<vetor.length;i++){
            aux = vetor[i];
            j=i-1;

            while (j>=0 && aux < vetor[j]){
                comparacoes++;
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
            trocas++;
        }
    }

    public static void main(String[] args) {
        int[] vetDes = new int[] {3, 0, 1, 8, 7, 2, 5, 4, 9, 6};
        ord(vetDes);
        System.out.println(Arrays.toString(vetDes));
    }
}
