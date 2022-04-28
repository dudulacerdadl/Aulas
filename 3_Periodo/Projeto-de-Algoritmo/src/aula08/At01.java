package aula08;

public class At01 {
    public static long fatorialNr(long num) {
        long aux = num;
        for (long i = num - 1; i > 0; i--) {
            aux *= i;
        }
        return aux;
    }

    public static long fatorialR(long num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fatorialR(num - 1);
        }
    }

    public static void main(String[] args) {
        int num = 15;

        System.out.println(15 + "! = " + fatorialNr(num) + " - Fatorial Não Recursivo");
        System.out.println(15 + "! = " + fatorialR(num) + " - Fatorial Recursivo");

    }
}
