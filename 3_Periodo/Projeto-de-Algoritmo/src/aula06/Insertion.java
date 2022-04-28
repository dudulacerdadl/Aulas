package aula06;

public class Insertion {
    public static void ordenar(int[] vetor) {
        int aux,j;
        int trocas = 0;
        for (int i=1;i<vetor.length;i++){
            aux = vetor[i];
            j=i-1;

            while (j>=0 && aux < vetor[j]){
                trocas++;
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

        System.out.println("Vetor ordenado:");
        for (int k : vetor) {
            System.out.print(k + " → ");
        }
        System.out.print(" Fim\n");
        System.out.println("Foram feitas " + trocas + " trocas");
    }
}
