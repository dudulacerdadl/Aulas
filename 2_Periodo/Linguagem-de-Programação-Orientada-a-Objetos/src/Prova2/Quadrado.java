package Prova2;

public class Quadrado extends Figura implements Superficie {
    private double lado;

    public Quadrado(String nome) {
        super(nome);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
