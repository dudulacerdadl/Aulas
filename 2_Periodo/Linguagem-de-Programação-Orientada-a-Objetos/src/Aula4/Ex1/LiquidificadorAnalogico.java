package Aula4.Ex1;

import Aula4.Ex1.Liquidificador;

public class LiquidificadorAnalogico extends Liquidificador {

    public LiquidificadorAnalogico(int novaVelocidadeMax) {
        super(novaVelocidadeMax);
    }

    public void aumentarVelocidade () {
        if ((getVelocidade() + 1) < getVelocidadeMax()) {
            setVelocidade(getVelocidade() + 1);
        } else {
            System.out.println("Velocidade máxima atingida");
        }
    }

    public void diminuirVelocidade () {
        if ((getVelocidade() - 1) > 0) {
            setVelocidade(getVelocidade() - 1);
        } else {
            System.out.println("Velocidade não pode mais ser diminuida");
        }
    }
}
