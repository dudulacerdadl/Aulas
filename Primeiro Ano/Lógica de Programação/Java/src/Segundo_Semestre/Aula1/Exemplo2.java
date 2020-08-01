package Segundo_Semestre.Aula1;

public class Exemplo2 {
    public static void main(String[] args) {
        int[] a = {2, 4, 8, 8, 10};
        int[] b = {1, 2, 3, 4, 5};
        int[] c = new int[5];
        int x = 0;
        boolean igual;

        for (int value : a) {
            igual = false;
            for (int i : b) {
                if (value == i) {
                    igual = true;
                    break;
                }
            }
            if (!igual) {
                for (int i : c) {
                    if (i == value) {
                        igual = true;
                        break;
                    }
                }
                if (!igual) {
                    c[x] = value;
                    x++;
                }
            }
        }


        for (int j : c) {
            System.out.println(j);
        }
    }
}
