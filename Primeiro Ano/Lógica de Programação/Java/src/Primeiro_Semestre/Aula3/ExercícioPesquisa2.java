package Primeiro_Semestre.Aula3;

import java.util.Scanner;

public class ExercícioPesquisa2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int timea=0, timeb=0, cond1=0, cond2=0, empate=0;
        while (cond1 != 9){
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("");
        System.out.println("[1] Aplicar pesquisa.");
        System.out.println("[2] Mostrar resultdado parcial.");
        System.out.println("[9] Fim.");
        System.out.println("");
        System.out.println("Digite um número:");
        cond1 = leia.nextInt();
        System.out.println("");
        if (cond1 == 1){
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("");
            System.out.println("[1] Vencedor: Time A");
            System.out.println("[2] Vencedor: Time B");
            System.out.println("[3] Empate");
            System.out.println("");
            System.out.println("Digite um número");
            cond2 = leia.nextInt();
            if (cond2 == 1) {
                System.out.println("");
                System.out.println("Você votou no Time A!");
                System.out.println("");
                timea++;
            } else if (cond2 == 2) {
                System.out.println("");
                System.out.println("Você votou no Time B!");
                System.out.println("");
                timeb++;
            } else if (cond2 == 3) {
                System.out.println("");
                System.out.println("Você votou por empate!");
                System.out.println("");
                empate++;
            } else if (cond2 == 9) {
            } else {
                System.out.println("");
                System.out.println("[ERRO] Digite um número válido.");
                System.out.println("");
                cond2 = leia.nextInt();
            }
        } else if (cond1 == 2) {
            System.out.println("");
            System.out.println("O resultado parcial é:");
            System.out.println("");
            System.out.println("Os votos para o Time A estão em: " + timea);
            System.out.println("Os votos para o Time B estão em: " + timeb);
            System.out.println("Os votos por Empate estão em: " + empate);
            System.out.println("");
        } else if (cond1 != 1 && cond1 !=2 && cond1 != 9){
            System.out.println("[ERRO] Digite um número válido.");
            cond1 = leia.nextInt();
        }
        }
        System.out.println("");
        System.out.println("O resoltado final foi:");
        System.out.println("");
        System.out.println("Os votos para o Time A terminaram em:" + timea);
        System.out.println("Os votos para o Time B terminaram em:" + timeb);
        System.out.println("Os votos por Empate terminaram em:" + empate);
    }
}
