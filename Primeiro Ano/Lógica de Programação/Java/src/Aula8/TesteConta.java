package Aula8;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String novoTitular;
        int opacao = 0;
        double valor;
        Conta conta1 = new Conta(100, "Edson");
        Conta conta2 = new Conta(222, "Ana");

        while (opacao != 9){
            System.out.println("1 - Consulta");
            System.out.println("2 - Corrige Titular");
            System.out.println("3 - Depósito");
            System.out.println("4 - Saque");
            System.out.println("9 - Sair");
            opacao = leia.nextInt(); leia.nextLine();
            switch (opacao){
                case 1:
                    System.out.println("Número da conta: " + conta1.getNumero());
                    System.out.println("Titular: " + conta1.getTitular());
                    System.out.println("Saldo: " + conta1.getSaldo());
                    break;
                case 2:
                    System.out.println("Novo titular");
                    novoTitular = leia.nextLine();
                    conta1.setTitular(novoTitular);
                    System.out.println("Atualizado com sucesso para " + conta1.getTitular());
                case 3:
                    System.out.println("Valor do Depósito: ");
                    valor = leia.nextDouble();
                    conta1.depositar(valor);
                    break;
                case 4:
                    System.out.println("Valor do Saque: ");
                    valor = leia.nextDouble();
                    conta1.sacar(valor);
                    break;
            }
        }
    }
}
