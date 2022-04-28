package aula08;

import java.util.Arrays;

public class ex01 {
    public void fibo(int fn) {
        int seq = 0;

        seq = (fn - 1) + (fn - 2);

        System.out.println(seq);
    }

    public static long fibonacci (int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        long[] vet = new long[5];

        for (int i = 0; i < 5; i++) {
            vet[i] = fibonacci(i);
        }
        System.out.println(Arrays.toString(vet));
    }
}
