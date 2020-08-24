package Aula4.Ex1;

public class Liquidificador {
    private int velocidade;
    private int velocidadeMax;

    public Liquidificador(int novaVelocidadeMax){
        if (novaVelocidadeMax > 0) {
            this.velocidadeMax = novaVelocidadeMax;
        } else {
            System.out.println("[ERRO] Digite um valor maior do que zero");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidade(int velocidade) {
        if (velocidade < getVelocidadeMax()) {
            this.velocidade = velocidade;
        } else {
            System.out.println("[ERRO] Digite uma velogidade válida");
        }
    }

    public void setVelocidadeMax(int velocidadeMax) {
        if (velocidadeMax > 0) {
            this.velocidadeMax = velocidadeMax;
        } else {
            System.out.println("[ERRO] Digite uma velocidade maior do que zero");
        }
    }
}
