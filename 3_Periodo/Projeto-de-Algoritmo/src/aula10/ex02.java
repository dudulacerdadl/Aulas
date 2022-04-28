package aula10;

public class ex02 {
    public static String rest = "";
    public static int tamanho;
    public static int cont = 0;

    public static void main(String[] args) {
        String name = "Maria";

        System.out.println(reverse(name));
    }

    public static String reverse (String name) {
        if (cont == 0) {
            tamanho = name.length() - 1;
        }
        if (tamanho >= 0) {
            cont ++;
            rest += name.charAt(tamanho);
            tamanho --;
            return reverse(name);
        } else {
            return rest;
        }
    }
}
