package Aula10.Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaStringToInteger {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> listN1 = new ArrayList<>();
        ArrayList<Integer> listN2 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        String num;
        int posicao;

        while (opcao != 9) {

            System.out.println("");
            System.out.println("[1] Inclua um novo par de números");
            System.out.println("[2] Separar pares");
            System.out.println("[9] Sair");
            opcao = input.nextInt();
            input.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite um par de números separados por espaços: ");
                        num = input.nextLine();
                        list.add(num);
                        break;
                    case 2:
                        for (int i = 0; i < list.size(); i++) {
                            num = list.get(i);
                            posicao = num.indexOf(' ');

                            listN1.add(Integer.parseInt(num.substring(0, posicao)));
                            listN2.add(Integer.parseInt(num.substring(posicao + 1)));
                        }
                        for (int i = 0; i < listN1.size(); i++) {
                            System.out.println((i+1) + "º Lista 1: " + listN1.get(i));
                            System.out.println((i+1) + "º Lista 2: " + listN2.get(i));
                        }
                        listN1 = new ArrayList<>();
                        listN2 = new ArrayList<>();
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println("[ERRO] Digite um número válido!");
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
