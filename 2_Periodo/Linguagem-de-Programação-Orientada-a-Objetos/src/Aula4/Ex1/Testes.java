package Aula4.Ex1;

import Aula4.Ex1.LiquidificadorAnalogico;
import Aula4.Ex1.LiquidificadorDigital;

import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
        int opcao1 = 0;
        int opcao2 = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Você pretente iniciar um Liquidificador Analógico [1] ou Digital [2]?");
        opcao1 = leia.nextInt();

        if (opcao1 == 1) {
            System.out.println("Qual o valor da velocidade máxima?");
            int velmax = leia.nextInt();
            LiquidificadorAnalogico liqana = new LiquidificadorAnalogico(velmax);
            System.out.println("Qual a velocidade que o liquidificador se encontra agora?");
            liqana.setVelocidade(leia.nextInt());

            while (opcao2 != 9) {
                System.out.println("O que deseja fazer agora?");
                System.out.println("[1] Aumentar velocidade");
                System.out.println("[2] Diminuir a velocidade");
                System.out.println("[9] Sair");
                opcao2 = leia.nextInt();
                if (opcao2 == 1) {
                    liqana.aumentarVelocidade();
                    System.out.println("Sua velcidade atual é " + liqana.getVelocidade());
                } else if (opcao2 == 2) {
                    liqana.diminuirVelocidade();
                    System.out.println("Sua velcidade atual é " + liqana.getVelocidade());
                } else if (opcao2 != 9) {
                    System.out.println("[ERRO] Digite um valor válido");
                }
            }
        } else if (opcao1 == 2) {

            System.out.println("Qual o valor da velocidade máxima?");
            int velmax = leia.nextInt();
            LiquidificadorDigital liqdig = new LiquidificadorDigital(velmax);
            System.out.println("Qual a velocidade que o liquidificador se encontra agora?");
            liqdig.trocarVelocidade(leia.nextInt());

            while (opcao2 != 9) {
                System.out.println("O que deseja fazer agora?");
                System.out.println("[1] Mudar velocidade");
                System.out.println("[9] Sair");
                opcao2 = leia.nextInt();
                if (opcao2 == 1) {
                    System.out.println("Qual valor deseja atribuir?");
                    liqdig.trocarVelocidade(leia.nextInt());
                    System.out.println("Sua velcidade atual é " + liqdig.getVelocidade());
                } else if (opcao2 != 9) {
                    System.out.println("[ERRO] Digite um valor válido");
                }
            }
        } else if (opcao1 != 9){
            System.out.println("[ERRO] Digite uma opção válida!");
        }


//        liqana.setVelocidade(1);
//        liqdig.trocarVelocidade(1);

//        for (int i = 0; i < 40; i++) {
//            if (i < 20) {
//                liqdig.trocarVelocidade(i);
//                liqana.aumentarVelocidade();
//                System.out.println("A velocidade do liquidificador Digital é " + liqdig.getVelocidade() + ", enquanto a velocidade do Liquidificador Analógico é " + liqana.getVelocidade());
//            } else {
//                liqana.diminuirVelocidade();
//                System.out.println("A velocidade do liquidificador Digital é " + liqdig.getVelocidade() + ", enquanto a velocidade do Liquidificador Analógico é " + liqana.getVelocidade());
//            }
//        }
//        liqdig.trocarVelocidade(1);
//        System.out.println("A velocidade do liquidificador Digital é " + liqdig.getVelocidade() + ", enquanto a velocidade do Liquidificador Analógico é " + liqana.getVelocidade());
    }
}
