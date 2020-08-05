package Primeiro_Semestre.Aula3;

import java.util.Scanner;

public class ExercícioPesquisa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao, palpite, timeA=0, timeB=0, empate=0;
        System.out.println("1 - Aplicar pesquisa");
        System.out.println("2 - Mostrar resultado");
        System.out.println("9 - Sair");
        opcao = leia.nextInt();
        while (opcao != 9){
            if (opcao == 1){
                do{
                    System.out.println("1 - Vencedor Time A");
                    System.out.println("2 - Vencedor Time B");
                    System.out.println("3 - Empate");
                    System.out.println("9 - Sair");
                    palpite = leia.nextInt();
                    switch (palpite){
                        case 1 : timeA++;
                            break;
                        case 2 : timeB++;
                            break;
                        case 3 : empate++;
                            break;
                        case 9 :
                            System.out.println("Fim palpite");
                            break;
                        default:
                            System.out.println("Palpite incorreto");
                    }
                }while (palpite !=9);
            }else{
                if (opcao == 2){
                    System.out.println("Votos time A: " + timeA);
                    System.out.println("Votos time B: " + timeB);
                    System.out.println("Empate: " + empate);
                }
            }
            System.out.println("1 - Aplicar pesquisa");
            System.out.println("2 - Mostrar resultado");
            System.out.println("9 - Sair");
            opcao = leia.nextInt();
        }
    }
}
