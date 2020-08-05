package Primeiro_Semestre.ex01;

import java.util.Scanner;

public class UsaProjetos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        String nome;
        String novoNome;
        int adicinar;
        double novoCustoHora;

        System.out.println("Digite o seu nome: ");
        nome = leia.nextLine();
        if (nome.equals("")) {
            while (nome.equals("")) {
                System.out.println("[ERRO] Digite um número válido:");
                nome = leia.nextLine();
            }
        }
        System.out.println("Digite o custo hora: ");
        System.out.println("(Caso queria usar usar o custo padrão, digite 0)");
        int custoHora = leia.nextInt();

        /*if (custoHora == 0) {
            Projetos projeto = new Projetos(nome);
        } else {
            Projetos projeto = new Projetos(nome, custoHora);
        }*/

        if (custoHora == 0){
            Projetos projeto1 = new Projetos(nome);
            while (opcao != 9) {
                System.out.println("1 - Atualizar nome do projeto");
                System.out.println("2 - Atualizar custo hora");
                System.out.println("3 - Registrar horas trabalhadas");
                System.out.println("4 - Consultar projeto");
                System.out.println("9 - Encerrar o programa");
                opcao = leia.nextInt();
                leia.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite um novo nome: ");
                        novoNome = leia.nextLine();
                        if (novoNome.equals("")) {
                            while (novoNome.equals("")) {
                                System.out.println("[ERRO] Digite um número válido:");
                                novoNome = leia.nextLine();
                            }
                        }
                        projeto1.setNome(novoNome);
                        System.out.println("O novo nome do projeto é: " + projeto1.getNome());
                        break;
                    case 2:
                        System.out.println("Digite o novo custo: ");
                        novoCustoHora = leia.nextDouble();
                        if (novoCustoHora < 1) {
                            while (novoCustoHora < 1) {
                                System.out.println("[ERRO] Digite um número válido:");
                                novoCustoHora = leia.nextDouble();
                            }
                        }
                        projeto1.setCustoHora(novoCustoHora);
                        System.out.println("O novo custo hora é: " + projeto1.getCustoHora());
                        break;
                    case 3:
                        System.out.println("Horas adicinonadas: ");
                        adicinar = leia.nextInt();
                        projeto1.registrarHoras(adicinar);
                        System.out.println("As horas adicionados: " + projeto1.getHora());
                        break;
                    case 4:
                        System.out.println("Nome do projeto: " + projeto1.getNome());
                        System.out.println("Custo hora: " + projeto1.getCustoHora());
                        System.out.println("Horas trabalhadas: " + projeto1.getHora());
                        System.out.println("Custo Atual: R$" + projeto1.getCustoAtual());
                        break;
                }
            }
        } else {
            Projetos projeto2 = new Projetos(nome, custoHora);
            while (opcao != 9){
                System.out.println("1 - Atualizar nome do projeto");
                System.out.println("2 - Atualizar custo hora");
                System.out.println("3 - Registrar horas trabalhadas");
                System.out.println("4 - Consultar projeto");
                System.out.println("9 - Encerrar o programa");
                opcao = leia.nextInt(); leia.nextLine();

                switch (opcao){
                    case 1:
                        System.out.println("Digite um novo nome: ");
                        novoNome = leia.nextLine();
                        if (novoNome.equals("")) {
                            while (novoNome.equals("")) {
                                System.out.println("[ERRO] Digite um número válido:");
                                novoNome = leia.nextLine();
                            }
                        }
                        projeto2.setNome(novoNome);
                        System.out.println("O novo nome do projeto é: " + projeto2.getNome());
                        break;
                    case 2:
                        System.out.println("Digite o novo custo: ");
                        novoCustoHora = leia.nextDouble();
                        projeto2.setCustoHora(novoCustoHora);
                        System.out.println("O novo custo hora é: " + projeto2.getCustoHora());
                        break;
                    case 3:
                        System.out.println("Horas adicinonadas: ");
                        adicinar = leia.nextInt();
                        projeto2.registrarHoras(adicinar);
                        System.out.println("As horas adicionados: " + projeto2.getHora());
                        break;
                    case 4:
                        System.out.println("Nome do projeto: " + projeto2.getNome());
                        System.out.println("Custo hora: " + projeto2.getCustoHora());
                        System.out.println("Horas trabalhadas: " + projeto2.getHora());
                        System.out.println("Custo Atual: R$" + projeto2.getCustoAtual());
                        break;
                }
            }
        }
    }
}