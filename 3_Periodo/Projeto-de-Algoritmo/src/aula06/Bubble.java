package aula06;

public class Bubble {
    public static void ordenar(int[] vetor){
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
        System.out.print("\nVetor ordenado:");
        for (int j : vetor) {
            System.out.print(j + " → ");
        }
        System.out.print(" Fim\n");
        System.out.println("Foram feitas " + trocas + " trocas");
        System.out.println("Foram feitas " + comparacoes + " comparações");
    }
}
