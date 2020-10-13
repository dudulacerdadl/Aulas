package Aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1, numero2;

        try {
            System.out.print("Digite o primeiro número: ");
            numero1 = leia.nextInt();
            System.out.print("Digite o segundo número: ");
            numero2 = leia.nextInt();
            System.out.println("O resultado da divisão é " + numero1 / numero2);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido");
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
        }
    }
}
