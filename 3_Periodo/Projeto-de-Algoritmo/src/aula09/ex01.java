package aula09;

public class ex01 {
    public static int soma (int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + soma(n - 1);
        }
    }

    public static void main(String[] args) {
        int num = 5;

        System.out.println("A soma de todos os números de 0 até " + num + " será " + soma(num));
    }
}
