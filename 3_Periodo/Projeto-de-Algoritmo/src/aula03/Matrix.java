package aula03;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ControlMatrix cm = new ControlMatrix();
        int[] vetA = new int[10];
        int[] vetB = new int[10];
        int option = 0;

        while (option != 8) {
            System.out.println("** Menu de Opções **\n");
            System.out.println("1. Inserir o vetor A");
            System.out.println("2. Exibir o vetor A");
            System.out.println("3. Inserir o vetor B");
            System.out.println("4. Exibir o vetor B");
            System.out.println("5. Pesquisar elemento no vetor A");
            System.out.println("6. Pesquisar elemento no vetor B");
            System.out.println("7. Pesquisar elemento nos dois vetores");
            System.out.println("8. Sair");
            System.out.print("R..: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    cm.adicionar(vetA);
                    break;
                case 2:
                    cm.visualizar(vetA);
                    break;
                case 3:
                    cm.adicionar(vetB);
                    break;
                case 4:
                    cm.visualizar(vetB);
                    break;
                case 5:
                    System.out.print("Insira o número que deseja pesquisar: ");
                    int pesq1 = input.nextInt();
                    cm.pesquisarExclusivo(vetA, pesq1);
                    break;
                case 6:
                    System.out.print("Insira o número que deseja pesquisar: ");
                    int pesq2 = input.nextInt();
                    cm.pesquisarExclusivo(vetB, pesq2);
                    break;
                case 7:
                    System.out.print("Insira o número que deseja pesquisar: ");
                    int pesq3 = input.nextInt();
                    cm.pesquisarGeral(vetA, vetB, pesq3);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
        System.out.println("Obrigado por particiar!");
    }
}
