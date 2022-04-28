package Prova2;

import java.util.ArrayList;
import java.util.Scanner;

public class Princial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt = 0;
        Quadrado qdd = new Quadrado("Roberson");
        Cubo cub = new Cubo("Claudemilson");

        ArrayList<Figura> array = new ArrayList<>();

        try {
            qdd.setLado(12);
            cub.setAresta(12);
        } catch (Exception e) {
            System.out.println("Digite um valor válido para as figuras");
        }

        array.add(qdd);
        array.add(cub);

        for (int i = 0; i < array.size(); i++) {
            Figura aux = array.get(i);
            if (aux instanceof Volume) {
                System.out.println("O nome da figura é " + aux.getNome());
                System.out.println("A área da figura é " + ((Cubo) aux).calculaArea());
                System.out.println("O volume da figura é " + ((Cubo) aux).calculaVolume());
            } else {
                System.out.println("O nome da figura é " + aux.getNome());
                System.out.println("A área da figura é " + ((Quadrado) aux).calculaArea());
            }
        }
    }
}
