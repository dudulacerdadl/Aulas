package aula01;

public class ex1 {

    public static void teste() {
        System.out.println(" ** Estou dentro da função teste() **");

        int a = 10;
        int b = 20;

        double soma = a + b;

        System.out.println("A soma é: " + soma);
    }

    public static void unifil() {
        String nome = "UniFil";

        System.out.println("O nome da empresa é: " + nome);
    }

    public static void main(String[] args) {

        int val = 0;
        int val2 = 0;

        System.out.println("Programa Principal");

        teste();

        System.out.println("Final do Programa");

        unifil();

    }
}
