package Aula14;

public class SeguroDeVida implements Tarifado {
    /*
     * implemente a tarifa da apólice é 2% do valor do seguro
     *
     * inclua os metodos get e set para cada atributo
     */
    private int numeroApolice;
    private String titular;
    private double valorSeguro;

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double getTarifa() {
        return this.getValorSeguro() * 2/100;
    }
}
