package Aula10.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class UsaArrayTeste {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        UsaArray ua = new UsaArray();
        int[] array = new int[0];
        int[] array2 = new int[0];
        int length;

        int opcao = 0;

        while (opcao != 9) {

            System.out.println("");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Carregar Array");
            System.out.println("[2] Mostrar Array");
            System.out.println("[3] Dividir Arrays");
            System.out.println("[9] Sair");
            System.out.print("R:");
            opcao = leia.nextInt();
            leia.nextLine();
            System.out.println("");

            switch (opcao) {
                case 1:
                    System.out.print("Passe o tamanho do Array: ");
                    length = leia.nextInt();
                    array = new int[length];
                    ua.carregaArray(array);
                    break;
                case 2:
                    System.out.println(ua.mostraArray(array));
                    break;
                case 3:
                    length = array.length;
                    array2 = new int[length];
                    ua.carregaArray(array2);
                    System.out.println("Lista da divisão: " + Arrays.toString(ua.geraArrayDivisao(array, array2)));
                    break;
                case 9:
                    break;
                default:
                    System.out.println("[ERRO] Digite um valor válido!");
                    break;
            }
        }
    }
}
