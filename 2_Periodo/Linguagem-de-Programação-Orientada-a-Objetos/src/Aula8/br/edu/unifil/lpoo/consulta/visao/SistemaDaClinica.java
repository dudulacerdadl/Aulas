package Aula8.br.edu.unifil.lpoo.consulta.visao;

import Aula8.br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;

import java.util.Scanner;

public class SistemaDaClinica {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        CadastroDeConsultas cad = new CadastroDeConsultas();
        int opcao = 0;
        String novoNome;
        String novaMatricula;
        int novoNumeroDependentes;
        int novoAnoInclusao;
        double novoValorConsulta;
        String tipoPlano;

        System.out.println("Bem-Vindo ao nosso Sistema!");
        System.out.println("---------------------------");

        while (opcao != 9) {
            System.out.println("O que deseja?");
            System.out.println("");
            System.out.println("[1] Cadastrar nova consulta");
            System.out.println("[2] Listar por Tipo de Plano");
            System.out.println("[3] Total de Consultas por Plano");
            System.out.println("[4] Valor Total por Plano");
            System.out.println("[9] Sair");
            System.out.println("");
            System.out.print("R: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite seu nome: ");
                    novoNome = leia.nextLine();
                    System.out.print("Digite a sua matrícula: ");
                    novaMatricula = leia.nextLine();
                    System.out.print("Digite seu número de dependentes: ");
                    novoNumeroDependentes = leia.nextInt();
                    System.out.print("Digite seu ano de inclusão: ");
                    novoAnoInclusao = leia.nextInt();
                    System.out.print("Digite o valor da consulta: ");
                    novoValorConsulta = leia.nextDouble();

                    cad.novaConsulta(novoNome, novaMatricula, novoNumeroDependentes, novoAnoInclusao, novoValorConsulta);
                    break;
                case 2:
                    System.out.print("Digite o tipo de plano desejado: ");
                    tipoPlano = leia.nextLine();

                    System.out.println(cad.listarConsultas(tipoPlano));
                    break;
                case 3:
                    System.out.print("Digite o tipo de plano desejado: ");
                    tipoPlano = leia.nextLine();

                    System.out.println(cad.totalConsultas(tipoPlano));
                    break;
                case 4:
                    System.out.print("Digite o tipo de plano desejado: ");
                    tipoPlano = leia.nextLine();

                    System.out.println(cad.valorConsultas(tipoPlano));
                case 9:
                    break;
            }
        }
        System.out.println("Muito obrigado por usar nosso sistema!");
    }
}
