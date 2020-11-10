package Aula14;

public class ContaEspecial extends Conta implements Tarifado {
    private double valorLimite;

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }

    @Override
    public double getTarifa() {
        return valorReferencia * 12/100;
    }

    /*
     * inclua o atributo valorLimite
     * métodos get e set para valorLimite
     *
     * implemente a tarifa da conta corrente é 12% do valor de referencia
     */

}
