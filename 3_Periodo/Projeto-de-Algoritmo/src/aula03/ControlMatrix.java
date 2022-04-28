package aula03;

import java.util.Scanner;

public class ControlMatrix {
    public Scanner input = new Scanner(System.in);

    public boolean vazio (int[] num) {
        boolean empty = false;
        for (int i : num) {
            if (i != 0) {
                break;
            } else {
                empty = true;
            }
        }
        return empty;
    }

    public void adicionar (int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print("Vet[" + (i + 1) + "] = ");
            num[i] = input.nextInt();
        }
    }

    public void visualizar (int[] num) {
        System.out.print("\nR..: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " -→ ");
        }
        System.out.println(" FIM");
    }

    public void pesquisarExclusivo (int[] num, int pesq) {
        int[] rest = new int[num.length];
        int count = 0;
        boolean isVazio = vazio(num);
        if (isVazio) {
            System.out.println("Insira os elementos antes de realizar a pesquisa");
        } else {
            System.out.println(isVazio);
            for (int i = 0; i < num.length; i++) {
                if (pesq == num[i]) {
                    rest[count] = (i + 1);
                    count ++;
                }
            }
            System.out.print("O número " + pesq + " apareceu nos índices: ");
            for (int i = 0; i < rest.length; i++) {
                if (rest[i] != 0){
                    System.out.print(rest[i] + " ");
                }
            }
            System.out.println("");
        }
    }

    public void pesquisarGeral (int[] num1, int[] num2, int pesq) {
        int[] rest = new int[(num1.length + num2.length)];
        int count = 0;
        boolean isVazio1 = vazio(num1);
        boolean isVazio2 = vazio(num2);
        if (isVazio1 && isVazio2) {
            System.out.println("Insira os elementos antes de realizar a pesquisa");
        } else {
            for (int i = 0; i < num1.length; i++) {
                if (pesq == num1[i]) {
                    rest[count] = (i + 1);
                    count ++;
                }
                if (pesq == num2[i]) {
                    rest[count] = (i + 1);
                    count ++;
                }
            }
            System.out.print("O número " + pesq + " apareceu nos índices: ");
            for (int i = 0; i < rest.length; i++) {
                if (rest[i] != 0){
                    System.out.print(rest[i] + " ");
                }
            }
            System.out.println("");
        }
    }
}
