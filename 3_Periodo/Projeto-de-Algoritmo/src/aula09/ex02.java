package aula09;

public class ex02 {
    public static int cont;

    public static int RecuCont(int num){
        if (num != 0) {
            cont++;
            RecuCont(num/10);
        }
        return cont;
    }

    public static void main(String[] args) {
        int num = 15;

        System.out.println("O número de " + RecuCont(num));
    }
}

