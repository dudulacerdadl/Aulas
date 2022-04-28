package aula01;

import java.util.Scanner;

public class ex2 {
    public static double teste(int a, int b) {
        System.out.println(" ** Estou dentro da função teste() **");
        double soma = a * b;

        return soma;
    }

    public static void unifil() {
        String nome = "UniFil";

        System.out.println("O nome da empresa é: " + nome);
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int val1 = 0;
        int val2 = 0;

        System.out.println("Programa Principal");

        System.out.print("Valor 1: ");
        val1 = ler.nextInt();
        System.out.print("Valor 2: ");
        val2 = ler.nextInt();

        double retorno = teste(val1, val2);
        System.out.println(retorno);

        unifil();

        System.out.println("Final do Programa");
    }
}
