package Aula8;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Conta conta1 = new Conta(100, "Edson");
        Conta conta2 = new Conta(222, "Ana");

        System.out.println("Digite o seu saldo: ");
        conta1.saldo = leia.nextInt();
        System.out.println("Saldo: " + conta1.saldo);
    }
}
