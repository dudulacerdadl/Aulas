package Aula12.br.edu.unifil.lp1.abstrato.visao;

import Aula12.br.edu.unifil.lp1.abstrato.controle.Controle;
import Aula12.br.edu.unifil.lp1.abstrato.modelo.Funcionario;

import java.util.Scanner;

public class visao {
    public static void main(String[] args) {
        Controle cnt = new Controle();
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int opcao2 = 0;

        String nome;
        int matricula;
        double salario;
        int qtdProd;
        double hrsTrab;
        double comissao;
        int qntVendas;

        System.out.println("Bem-vindo ao sistema");
        while (opcao != 9) {
            System.out.println("O que deseja?");
            System.out.println();
            System.out.println("[1] Incluir funcionário");
            System.out.println("[2] Listar todos os funcionários");
            System.out.println("[3] Consultar funcionário por matrícula");
            System.out.println("[4] Demitir funcionário");
            System.out.println("[5] Alterar salário do funcionário");
            System.out.println("[9] Sair");
            System.out.println();
            System.out.print("R: ");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de funcionário você defeja criar:");
                    System.out.println("[1] Mensalista");
                    System.out.println("[2] Horista");
                    System.out.println("[3] Comissionado");
                    System.out.println("[4] Produção");
                    System.out.print("R: ");
                    opcao2 = input.nextInt();
                    input.nextLine();
                    switch (opcao2) {
                        case 1:
                            try {
                                System.out.print("Digite o nome do funcionário: ");
                                nome = input.nextLine();
                                System.out.print("Digite a matrícula do funcionário: ");
                                matricula = input.nextInt();
                                System.out.print("Digite o salário do funcionário: ");
                                salario = input.nextDouble();
                                cnt.cadastrarFuncionario(nome, matricula, salario);
                            } catch (Exception e) {
                                System.out.println("Ocorreu um erro: " + e.getMessage());
                            }
                            break;
                        case 2:
                            try {
                                System.out.print("Digite o nome do funcionário: ");
                                nome = input.nextLine();
                                System.out.print("Digite a matrícula do funcionário: ");
                                matricula = input.nextInt();
                                System.out.print("Digite o salário do funcionário: ");
                                salario = input.nextDouble();
                                System.out.print("Digite as horas trabalhadas: ");
                                hrsTrab = input.nextDouble();
                                cnt.cadastrarFuncionario(nome, matricula, salario, hrsTrab);
                            } catch (Exception e) {
                                System.out.println("Ocorreu um erro: " + e.getMessage());
                            }
                            break;
                        case 3:
                            try {
                                System.out.print("Digite o nome do funcionário: ");
                                nome = input.nextLine();
                                System.out.print("Digite a matrícula do funcionário: ");
                                matricula = input.nextInt();
                                System.out.print("Digite o salário do funcionário: ");
                                salario = input.nextDouble();
                                System.out.print("Digite a quantidade de vendas realizadas: ");
                                qntVendas = input.nextInt();
                                System.out.print("Digite o valor da comissão: ");
                                comissao = input.nextDouble();
                                cnt.cadastrarFuncionario(nome, matricula, salario, comissao, qntVendas);
                            } catch (Exception e) {
                                System.out.println("Ocorreu um erro: " + e.getMessage());
                            }
                            break;
                        case 4:
                            try {
                                System.out.print("Digite o nome do funcionário: ");
                                nome = input.nextLine();
                                System.out.print("Digite a matrícula do funcionário: ");
                                matricula = input.nextInt();
                                System.out.print("Digite o salário do funcionário: ");
                                salario = input.nextDouble();
                                System.out.print("Digite a quantidade de itens produzidos: ");
                                qtdProd = input.nextInt();
                                cnt.cadastrarFuncionario(nome, matricula, salario, qtdProd);
                            } catch (Exception e) {
                                System.out.println("Ocorreu um erro: " + e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Digite um valor válido!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println(cnt.listarFuncionario());
                    break;
                case 3:
                    try {
                        System.out.print("Digite a matrícula do funcionário desejado: ");
                        matricula = input.nextInt();

                        nome = cnt.getFuncionario(matricula).getDescricao();
                        System.out.println(nome);
                    } catch (NullPointerException e) {
                        System.out.println("Valor nulo digitado. Insira um valor válido");
                    }
                    break;
                case 4:
                    System.out.print("Digite a matrícula do funcionário: ");
                    matricula = input.nextInt();

                    Funcionario func = cnt.getFuncionario(matricula);
                    cnt.excluirFuncionario(func);

                    System.out.println("Funcionário demitido com sucesso!");
                    break;
                case 5:
                    System.out.print("Digite a matrícula do funcionário: ");
                    matricula = input.nextInt();
                    System.out.print("Digite o novo salário: ");
                    salario = input.nextDouble();

                    Funcionario auxFunc = cnt.getFuncionario(matricula);
                    auxFunc.setSalario(salario);

                    System.out.println("Salário atualizado com sucesso!");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }
    }
}
