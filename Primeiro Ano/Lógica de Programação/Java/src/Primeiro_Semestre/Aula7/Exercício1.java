package Primeiro_Semestre.Aula7;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        int cursolog[] = new int[15];
        int cursoprog[] = new int[10];
        int ambos[] = new int[10];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < cursoprog.length; i++){
            System.out.println("Digite o número da matrícula para o curso de Linguagem de Programação: ");
            cursoprog[i] = leia.nextInt();
        }
        for (int i = 0; i < cursolog.length; i++){
            System.out.println("Digite o número da matrícula para o curso de Lógica: ");
            cursolog[i] = leia.nextInt();
            for (int x = 0; x < cursoprog.length; x++){
                if (cursolog[i] == cursoprog[x]){
                    ambos[x] = cursolog[i];
                }
            }
        }

        System.out.println("Tivemos as seguintes matrículas em ambas as matérias: ");
        if (ambos[0] == 0){
            System.out.println("Matrícula: 0");
        }
        for (int i = 0; i < ambos.length; i ++){
            if (ambos[i] != 0) {
                System.out.println("Matrícula: " + ambos[i]);
            }
        }
    }
}
