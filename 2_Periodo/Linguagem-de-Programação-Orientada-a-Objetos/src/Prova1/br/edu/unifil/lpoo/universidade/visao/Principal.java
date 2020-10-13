package Prova1.br.edu.unifil.lpoo.universidade.visao;

import Prova1.br.edu.unifil.lpoo.universidade.controle.Controle;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Controle prof = new Controle();
        int opcao = 0;
        int opcao2;
        String novoNome;
        String novaMatricula;
        double novoSalario;
        int novaQntLicenca;
        double novaHorasTrabalhadas;

        System.out.println("Bem-Vindo ao nosso Sistema!");
        System.out.println("---------------------------");

        while (opcao != 9) {
            System.out.println("O que deseja?");
            System.out.println("");
            System.out.println("[1] Incluir Professor");
            System.out.println("[2] Listar Professor");
            System.out.println("[3] Mostrar Dados");
            System.out.println("[9] Sair");
            System.out.println("");
            System.out.print("R: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Tipo de Cadastro:");
                    System.out.println("");
                    System.out.println("[1] Professor Horista");
                    System.out.println("[2] Professor Dedicação Exclusiva");
                    System.out.println("");
                    System.out.print("R: ");
                    opcao2 = leia.nextInt();
                    leia.nextLine();
                    if (opcao2 == 1) {
                        System.out.print("Digite seu nome: ");
                        novoNome = leia.nextLine();
                        System.out.print("Digite sua matrícula: ");
                        novaMatricula = leia.nextLine();
                        System.out.print("Digite seu salário: ");
                        novoSalario = leia.nextDouble();
                        System.out.print("Digite suas horas trabalhadas: ");
                        novaHorasTrabalhadas = leia.nextDouble();

                        prof.icluirProfessor(novoNome, novoSalario, novaMatricula, novaHorasTrabalhadas);
                    } else if (opcao2 == 2) {
                        System.out.print("Digite seu nome: ");
                        novoNome = leia.nextLine();
                        System.out.print("Digite sua matrícula: ");
                        novaMatricula = leia.nextLine();
                        System.out.print("Digite seu salário: ");
                        novoSalario = leia.nextDouble();
                        System.out.print("Digite suas quantidade de licenças: ");
                        novaQntLicenca = leia.nextInt();

                        prof.icluirProfessor(novoNome, novoSalario, novaMatricula, novaQntLicenca);
                    } else {
                        System.out.println("[ERRO] Digite um valor válido");
                    }
                    break;
                case 2:
                    System.out.println(prof.listarProfessores());
                    break;
                case 3:
                    System.out.println(prof.mostrarDados());
                    break;
                case 9:
                    break;
                default:
                    System.out.println("[ERRO] Digite um valor válido");
                    break;
            }
        }
    }
}
