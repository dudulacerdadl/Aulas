package Prova2;

public class Cubo extends Figura implements Superficie, Volume {
    private double aresta;

    public Cubo(String nome) {
        super(nome);
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calculaArea() {
        return aresta * aresta * 6;
    }

    @Override
    public double calculaVolume() {
        return aresta * aresta * aresta;
    }
}
