package Primeiro_Semestre.Aula7;

public class Exercício2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 100);
            b[i] = (int)(Math.random() * 100);
            c[i * 2 + 1] = b[i];
            c[i * 2] = a[i];
        }

        System.out.print("A = {");
        for (int i = 0; i < a.length; i++){
            System.out.print(" " + a[i] + " ");
        }
        System.out.println("}");
        System.out.print("B = {");
        for (int i = 0; i < b.length; i++){
            System.out.print(" " + b[i] + " ");
        }
        System.out.println("}");
        System.out.print("C = {");
        for (int i = 0; i < c.length; i++){
            System.out.print(" " + c[i] + " ");
        }
        System.out.println("}");
    }
}
