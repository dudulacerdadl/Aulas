package aula08;

public class Fibo {
    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            System.out.println(i + "º - " + fibo(i));
        }
        System.out.println("");
        System.out.println("Fim da série");
    }

    static long fibo(int n) {
        if (n < 2 ) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
