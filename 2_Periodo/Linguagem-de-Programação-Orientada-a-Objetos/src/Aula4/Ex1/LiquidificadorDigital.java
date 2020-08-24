package Aula4.Ex1;

import Aula4.Ex1.Liquidificador;

public class LiquidificadorDigital extends Liquidificador {

    public LiquidificadorDigital(int novaVelocidadeMax) {
        super(novaVelocidadeMax);
    }

    public void trocarVelocidade (int novaVelocidade) {
        if (novaVelocidade > 0 && novaVelocidade < getVelocidadeMax()) {
            setVelocidade(novaVelocidade);
        } else {
            System.out.println("Valor não permitido");
        }
    }
}
