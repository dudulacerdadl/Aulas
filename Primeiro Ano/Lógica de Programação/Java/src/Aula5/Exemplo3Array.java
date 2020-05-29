package Aula5;

import java.util.Scanner;

public class Exemplo3Array {
    public static void main(String[] args) {
        int davy_jones[] = new int[5];
        int soma = 0;
        Scanner leia = new Scanner(System.in);

        for (int x = 0; x < davy_jones.length; x++){
            System.out.println("Valor: ");
            davy_jones[x] = leia.nextInt();
            if (davy_jones[x] % 2 != 0){
                soma += davy_jones[x];
            }
        }
        System.out.println("A soma dos ímpares é: " + soma);
    }
}
