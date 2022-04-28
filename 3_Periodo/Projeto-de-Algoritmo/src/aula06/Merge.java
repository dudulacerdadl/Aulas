package aula06;

public class Merge {
    public static void margeSort(int[] vetor, int[] vet, int ini, int fim) {

        if (ini < fim) {
            int meio = (ini + fim) / 2;
            margeSort(vetor, vet, ini, meio);
            margeSort(vetor, vet, meio + 1, fim);
            intercalar(vetor, vet, ini, meio, fim);
        }
    }

    private static void intercalar(int[] vetor, int[] vet, int ini, int meio, int fim) {
        for (int k = ini; k <= fim; k++){
            vet[k] = vetor[k];
        }

        int i = ini;
        int j = meio + 1;

        for (int k = ini; k <= fim; k++) {
            if (i > meio) {
                vetor[k] = vet[j++];
            } else if (j > fim) {
                vetor[k] = vet[i++];
            } else if (vet[i] < vet[j]){
                vetor[k] = vet[i++];
            } else {
                vetor[k] = vet[j++];
            }
        }
    }
}
