package Aula14;

public class ContaCorrente extends Conta implements Tarifado {
    @Override
    public double getTarifa() {
        return valorReferencia * 12/100;
    }
// implemente a tarifa da conta corrente é 12% do valor de referencia
}
