package Primeiro_Semestre.AulaFinal;

import java.util.Scanner;

public class TesteAviao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomeVoo;
        int quantPassageiros;
        char estado;
        int quantMaxima;
        int opcao = 0;

        System.out.println("Bem-Vindo ao Aeroporto de Jataizinho!");
        System.out.println();
        System.out.println("Digite a baixo as informações do seu voo:");
        System.out.println("----------");
        System.out.println();
        System.out.println("Nome do Voo: ");
        nomeVoo = leia.nextLine();
        System.out.println("----------");
        System.out.println("Quantidade máxima de passageiros do voo: ");
        quantMaxima = leia.nextInt();

        Aviao voo1 = new Aviao(nomeVoo, quantMaxima);

        while (opcao != 9) {
            System.out.println("----------");
            System.out.println("1 - Embarcar passageiro");
            System.out.println("2 - Desembarcar passageiro");
            System.out.println("3 - Decolar o avião");
            System.out.println("4 - Pousar o avião");
            System.out.println("9 - Encerrar o voo");
            System.out.println("----------");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao){
                case 1:
                    voo1.Embarcar();
                    int embarcar = (voo1.getQuantMaxima() - voo1.getQuantPassageiros());
                    System.out.println("Passageiro embarcado! Você ainda pode embarcar " + embarcar + " passageiros");
                    break;
                case 2:
                    voo1.Desembarcar();
                    System.out.println("Passageiro desembarcado! Você ainda pode desembarcar " + voo1.getQuantPassageiros() + " passageiros");
                    break;
                case 3:
                    voo1.Decolar();
                    break;
                case 4:
                    voo1.Pousar();
                    break;
            }
        }
        System.out.println("Obrigado por voar conosco!");
    }
}
