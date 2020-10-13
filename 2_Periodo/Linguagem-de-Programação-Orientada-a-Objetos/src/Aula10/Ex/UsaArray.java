package Aula10.Ex;

import java.util.Scanner;
public class UsaArray {
    private Scanner leia;

    public UsaArray(){
        leia = new Scanner(System.in);
    }

    public void carregaArray(int[] arr){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Escreva um número: ");
                arr[i] = leia.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
    public String mostraArray(int[] arr){
        String saida = "";
        for (int i = 0; i < arr.length; i++) {
            saida += "O valor na casa " + (i+1) + " é igual a " + arr[i] + "\n";
        }
        return saida;
    }

    public int[] geraArrayDivisao(int arrA[], int arrB[]){
        int[] arrRes = new int[arrA.length];
        try {
            for (int i = 0; i < arrA.length; i++) {
                arrRes[i] = arrA[i] / arrB[i];
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arrRes;
    }
}
