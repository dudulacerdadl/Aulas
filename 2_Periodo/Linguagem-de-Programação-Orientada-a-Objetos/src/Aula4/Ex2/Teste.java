package Aula4.Ex2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        String nome;
        String matricula;
        int dependentes;
        int ano;
        double valorConsulta;
        Scanner leia = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Bem-Vindo ao nosso Sistema! Por favor, preencha o cadastro:");
        System.out.println("Qual o seu nome? ");
        nome = leia.nextLine();
        System.out.println("Qual o seu número de matrícula? ");
        matricula = leia.nextLine();
        System.out.println("Qual o número de dependentes? ");
        dependentes = leia.nextInt();
        System.out.println("Qual o ano de inclusão? ");
        ano = leia.nextInt();
        System.out.println("Qual o valor da consulta? ");
        valorConsulta = leia.nextDouble();

        while (opcao != 9) {
            System.out.println("Escolha o seu tipo de plano:");
            System.out.println("[1] Prata");
            System.out.println("[2] Ouro");
            System.out.println("[3] Diamante");
            System.out.println("[4] Família");
            System.out.println("[9] Sair");
            opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    ConsultaPrata cp = new ConsultaPrata(nome, matricula, dependentes, ano, valorConsulta);
                    System.out.println("O valor da sua consulta, com o desconto do plano será de: " + cp.getValorConsulta());
                    break;
                case 2:
                    ConsultaOuro co = new ConsultaOuro(nome, matricula, dependentes, ano, valorConsulta);
                    System.out.println("O valor da sua consulta, com o desconto do plano será de: " + co.getValorConsulta());
                    break;
                case 3:
                    ConsultaDiamante cd = new ConsultaDiamante(nome, matricula, dependentes, ano, valorConsulta);
                    System.out.println("O valor da sua consulta, com o desconto do plano será de: " + cd.getValorConsulta());
                    break;
                case 4:
                    ConsultaFamilia cf = new ConsultaFamilia(nome, matricula, dependentes, ano, valorConsulta);
                    System.out.println("O valor da sua consulta, com o desconto do plano será de: " + cf.getValorConsulta());
                    break;
                case 9:
                    break;
                default:
                    System.out.println("[ERRO] Digite uma opção válida!");
                    break;
            }
        }
    }
}
