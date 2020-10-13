package Aula10;

import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String numero;
        int n1, n2, posicao;

        try {
            System.out.print("Informe um par de números: ");
            numero = leia.nextLine();
            //System.out.println(numero.indexOf(',')); // 10, 35
            //System.out.println(numero.indexOf("0,1"));
            //System.out.println(numero.indexOf(',', 5));
            //System.out.println(numero.substring(posicao + 1).replaceAll(" ", ""));
            posicao = numero.indexOf(',');

            n1 = Integer.parseInt(numero.substring(0, posicao).replaceAll(" ", ""));
            n2 = Integer.parseInt(numero.substring(posicao + 1).replaceAll(" ", ""));

            System.out.println("Número 1: " + n1);
            System.out.println("Número 2: " + n2);
        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro na conversão para int");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
