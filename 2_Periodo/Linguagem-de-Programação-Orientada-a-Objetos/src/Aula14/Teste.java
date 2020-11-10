package Aula14;

import java.util.ArrayList;

public class Teste {
    public static void main(String args[]) {
        ArrayList<Tarifado> lista = new ArrayList<>();

        ContaEspecial ce = new ContaEspecial();
        ce.setTitular("Alberto");
        ce.setValorLimite(1000);
        SeguroDeVida sv = new SeguroDeVida();
        sv.setTitular("Fernanda");
        sv.setValorSeguro(2000);
        ContaCorrente cc = new ContaCorrente();
        cc.setTitular("Carlos");

        lista.add(ce);
        lista.add(sv);
        lista.add(cc);

        for (int i = 0; i < lista.size(); i++) {
            Tarifado aux = lista.get(i);
            if (aux instanceof ContaCorrente) {
                System.out.println("CONTA CORRENTE");
                System.out.println("Titular: " + ((ContaCorrente) aux).getTitular());
                System.out.printf("Tarifa: R$%.2f\n\n", aux.getTarifa());
            } else if (aux instanceof ContaEspecial) {
                System.out.println("CONTA ESPECIAL");
                System.out.println("Titular: " + ((ContaEspecial) aux).getTitular());
                System.out.printf("Valor limite: R$%.2f\n", ((ContaEspecial) aux).getValorLimite());
                System.out.printf("Tarifa: R$%.2f\n\n", aux.getTarifa());
            } else if (aux instanceof SeguroDeVida) {
                System.out.println("SEGURO DE VIDA");
                System.out.println("Titular: " + ((SeguroDeVida) aux).getTitular());
                System.out.printf("Tarifa: R$%.2f\n\n", aux.getTarifa());
            }
        }

        //a) declarar e instanciar uma lista - ArrayList
        //b) criar um objeto ContaEspecial e setar o Titular e valor limite
        //c) criar um objeto SeguroVida, setar o Titular e valor do seguro
        //d) criar um objeto ContaCorrente e setar o Titular
        //e) adicionar ContaEspecial, ContaCorrente e SeguroVida na lista

        /*
         * f) percorrer lista e mostrar o valor da tarifa
         *    se é uma Conta Corrente, mostrar também o nome do titular
         *    se é um Seguro de Vida, mostrar também o nome do titular
         *    se é uma Conta Especial, mostrar também o nome do titular e valor do limite
         */
    }
}
