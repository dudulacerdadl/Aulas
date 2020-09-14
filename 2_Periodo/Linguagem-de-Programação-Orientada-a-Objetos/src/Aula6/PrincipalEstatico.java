package Aula6;

public class PrincipalEstatico {
    public static void main(String[] args) {
        System.out.println(Util.getImc(90, 1.84));

        double arrayNum[] = {10, 20, 30, 55, 69, 551};
        double arrayNum2[] = {50, 60, 70};
        System.out.println("Soma Array 1: " + Util.getSoma(arrayNum));
        System.out.println("Soma Array 2: " + Util.getSoma(arrayNum2));
        System.out.println(Util.getMedia(100, 50));
    }
}
