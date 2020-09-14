package Aula6;

public class Util {
    public static double getImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double getSoma(double numero[]){
        double soma = 0;
        for(int i=0; i<numero.length; i++){
            soma += numero[i];
        }
        return soma;
    }

    public static double getMedia(double numero1, double numero2){
        return (numero1 + numero2) / 2;
    }
}
