package Aula7.br.unifil.lpoo.equipe.visao;

import Aula7.br.unifil.lpoo.equipe.controle.Controle;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao = 0;
        String nomeEqp;
        String nomeJog;
        String nomePos;

        Controle controle = new Controle();

        while (opcao != 9) {
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] Cadastrar Jogador");
            System.out.println("[2] Cadastrar Equipe");
            System.out.println("[3] Contratar Jogador");
            System.out.println("[4] Demitir Jogador");
            System.out.println("[5] Listar jogadores de um time");
            System.out.println("[6] Listar jogadores por posição");
            System.out.println("[9] Encerrar o Programa");
            opcao = leia.nextInt();
            leia.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do jogador: ");
                    nomeJog = leia.nextLine();
                    System.out.print("Digite o nome da posição: ");
                    nomePos = leia.next();
                    controle.cadastrarJogador(nomeJog, nomePos);
                    break;
                case 2:
                    System.out.print("Digite o nome da equipe: ");
                    nomeEqp = leia.nextLine();
                    controle.cadastrarEquipe(nomeEqp);
                    break;
                case 3:
                    System.out.print("Digite o nome da equipe contratante: ");
                    nomeEqp = leia.nextLine();
                    System.out.print("Digite o nome do jogador: ");
                    nomeJog = leia.nextLine();
                    controle.contratarJogador(nomeEqp, nomeJog);
                    break;
                case 4:
                    System.out.print("Digite o nome da equipe demissora: ");
                    nomeEqp = leia.nextLine();
                    System.out.print("Digite o nome do jogador: ");
                    nomeJog = leia.nextLine();
                    controle.demitirJogador(nomeEqp, nomeJog);
                    break;
                case 5:
                    System.out.print("Digite o nome da equipe: ");
                    nomeEqp = leia.nextLine();
                    System.out.println(controle.listarJogEquipe(nomeEqp));
                    break;
                case 6:
                    System.out.print("Digite o nome da posição: ");
                    nomePos = leia.nextLine();
                    System.out.println(controle.listarJogPosicao(nomePos));
                    break;
                case 9:
                    break;
                default:
                    System.out.println("[ERRO] Digite uma opção válida!");
                    break;
            }
        };
    }
}
