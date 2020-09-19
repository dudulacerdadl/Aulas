package Fe.br.edu.unifil.lpoo.consulta.visao;

import Fe.br.edu.unifil.lpoo.consulta.controle.CadastroDeConsultas;

import java.util.Scanner;

public class SistemaDaClinica {
    public static void main(String[] args) {
        CadastroDeConsultas cadastro = new CadastroDeConsultas();
        Scanner input = new Scanner(System.in);

        int opc = 0;

        String nome;
        String matricula;
        int depNum;
        int ano;
        double valor = 0;
        int tipo;

        while (opc != 9){
            System.out.println("Escolha uma das opções a seguir: ");
            System.out.println("[ 1 ] Nova consulta");
            System.out.println("[ 2 ] Exibir pacientes por consulta");
            System.out.println("[ 3 ] Exibir total de consultas");
            System.out.println("[ 4 ] Exibir valor total de consultas");
            System.out.println("[ 9 ] Encerrar");
            System.out.print("O que deseja fazer? ");
            opc = input.nextInt();
            input.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Preencha as informações solicitadas: ");
                    System.out.print("Nome: ");
                    nome = input.nextLine();
                    System.out.print("Num. Matrícula: ");
                    matricula = input.nextLine();
                    System.out.print("Num. Dependentes: ");
                    depNum = input.nextInt();
                    System.out.print("Ano de inclusão do plano: ");
                    ano = input.nextInt();
                    System.out.print("Informe o valor da consulta: R$");
                    valor = input.nextDouble();
                    System.out.println("Escolha um tipo de consulta: ");
                    System.out.println("[ 1 ] Consulta prata");
                    System.out.println("[ 2 ] Consulta ouro");
                    System.out.println("[ 3 ] Consulta diamante");
                    System.out.println("[ 4 ] Consulta família");
                    tipo = input.nextInt();
                    cadastro.cadConsulta(tipo, nome, valor, matricula, depNum, ano);
                    System.out.println("Sua consulta foi cadastrada com sucesso!");
                    break;
                case 2:
                    System.out.println("[ 1 ] Consulta prata");
                    System.out.println("[ 2 ] Consulta ouro");
                    System.out.println("[ 3 ] Consulta diamante");
                    System.out.println("[ 4 ] Consulta família");
                    System.out.println("Escolha um tipo de consulta: ");
                    tipo = input.nextInt();
                    System.out.println(cadastro.detailsConsulta(tipo));
                    break;
                case 3:
                    System.out.println("[ 1 ] Consulta prata");
                    System.out.println("[ 2 ] Consulta ouro");
                    System.out.println("[ 3 ] Consulta diamante");
                    System.out.println("[ 4 ] Consulta família");
                    System.out.println("Escolha um tipo de consulta: ");
                    tipo = input.nextInt();
                    System.out.println("Total de consultas: " + cadastro.returnNumCon(tipo));
                    break;
                case 4:
                    System.out.println("[ 1 ] Consulta prata");
                    System.out.println("[ 2 ] Consulta ouro");
                    System.out.println("[ 3 ] Consulta diamante");
                    System.out.println("[ 4 ] Consulta família");
                    System.out.println("Escolha um tipo de consulta: ");
                    tipo = input.nextInt();
                    System.out.println("Valor total: " + cadastro.totalCon(tipo));
                    break;
            }

        }
        System.out.println("Programa encerrado.");

    }
}