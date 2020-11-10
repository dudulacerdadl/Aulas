package Aula13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Controle cnt = new Controle();
        ControleSistema cts = new ControleSistema();
        String name;
        double salary;
        String password;
        String bilingual;
        int registration;

        int option = 0;
        int option2 = 0;

        System.out.println("Bem-vindo ao sistema");
        while (option != 9) {
            System.out.println("O que deseja hoje?");
            System.out.println("[1] Incluir funcionário");
            System.out.println("[2] Login do funcionário");
            System.out.println("[3] Incluir fornecedor");
            System.out.println("[4] Login de fornecedor");
            System.out.println("[9] Fim");
            System.out.println();
            System.out.print("R: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Digite o nome do funcionário: ");
                    name = input.nextLine();
                    System.out.print("Digite o salário do funcionário: ");
                    salary = input.nextDouble();
                    System.out.println("Que tipo de funcionário deseja instânciar: ");
                    System.out.println("[1] Diretor");
                    System.out.println("[2] Gerente");
                    System.out.println("[3] Secretário");
                    System.out.println();
                    System.out.print("R: ");
                    option2 = input.nextInt();
                    input.nextLine();

                    switch (option2) {
                        case 1:
                            System.out.print("Digite a senha do diretor: ");
                            password = input.nextLine();
                            Diretor dir = new Diretor();
                            dir.setNome(name);
                            dir.setSalario(salary);
                            dir.setSenha(password);
                            cnt.inserirFuncionario(dir);
                            break;
                        case 2:
                            System.out.print("Digite a senha do diretor: ");
                            password = input.nextLine();
                            Gerente ger = new Gerente();
                            ger.setNome(name);
                            ger.setSalario(salary);
                            ger.setSenha(password);
                            cnt.inserirFuncionario(ger);
                            break;
                        case 3:
                            System.out.println("A secretária é bilíngue? [S/N]");
                            System.out.print("R: ");
                            bilingual = input.nextLine().toUpperCase();
                            if (bilingual.equals("S")) {
                                Secretaria sec = new Secretaria();
                                sec.setNome(name);
                                sec.setSalario(salary);
                                sec.setBilingue(true);
                                cnt.inserirFuncionario(sec);
                            } else if (bilingual.equals("N")) {
                                Secretaria sec = new Secretaria();
                                sec.setNome(name);
                                sec.setSalario(salary);
                                sec.setBilingue(false);
                                cnt.inserirFuncionario(sec);
                            } else {
                                System.out.println("Digite uma opção válida para a secretária ser bilíngua ou não");
                            }
                            break;
                        default:
                            System.out.println("Digite uma opção válida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Digite a matrícula do funcionário: ");
                    registration = input.nextInt();
                    input.nextLine();
                    Funcionario fun = cnt.getFuncionario(registration);
                    try {
                        if (fun instanceof Acesso) {
                            System.out.print("Digite sua senha: ");
                            password = input.nextLine();
                            if (cts.login((Acesso) fun, password)) {
                                System.out.println("Acesso liberado!");
                            } else {
                                System.out.println("Senha incorreta");
                            }
                        } else {
                            System.out.println("[ERRO] Funcionário " + fun.getNome() + " não possui acesso!");
                        }
                    } catch (NullPointerException e) {
                        System.out.println("[ERRO] Matrícula não existente!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do fornecedor: ");
                    name = input.nextLine();
                    Fornecedor forn = new Fornecedor();
                    forn.setNome(name);
                    cnt.inserirFornecedor(forn);
                    break;
                case 4:
                    System.out.print("Digite o nome do fornecedor: ");
                    name = input.nextLine();
                    Fornecedor func = cnt.getFornecedor(name);
                    if (func != null) {
                        System.out.print("Digite sua senha: ");
                        password = input.nextLine();
                        if (func.isLiberado(password)) {
                            System.out.print("Acesso liberado!\n");
                        } else {
                            System.out.print("Senha incorreta!\n");
                        }
                    } else {
                        System.out.println("[ERRO] Forncededor não cadastrado!");
                    }
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
