package aula10;

public class ex01 {
    public static int cont;
    public static int m;

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;

        System.out.println(mdc(num1, num2));
    }

    public static int mdc (int num1, int num2) {
        int max = num1 > num2 ? num1: num2;
        cont ++;
        if (cont < max) {
            if (num1 % cont == 0 && num2 % cont == 0) {
                m = cont;
            }
            return mdc(num1, num2);
        } else {
            return m;
        }
    }
}
