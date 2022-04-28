package aula01;

import java.util.Scanner;

public class exercicio1 {
    public static double salBr (double sal, int hr) {
        return sal * hr;
    }

    public static double trib (double salBr) {
        return salBr * 0.09;
    }

    public static double salLiq (double sal, double tr) {
        return sal - tr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double sal = input.nextDouble();

        System.out.print("Digite as horas trabalhadas: ");
        int hr = input.nextInt();

        double salarioB = salBr(sal, hr);
        System.out.println("Salário Bruto: R$" + salarioB);
        double trib = trib(salarioB);
        System.out.println("Tributos: R$" + trib);
        double salarioL = salLiq(salarioB, trib);
        System.out.println("Salário Líquido: R$" + salarioL);
    }
}
