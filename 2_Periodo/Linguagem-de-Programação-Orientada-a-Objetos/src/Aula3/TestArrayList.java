package Aula3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Empregado> lisaEmp = new ArrayList<Empregado>();
        Empregado emp = new Empregado("Edson", 1000);
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salario;

        for (int i = 0; i < 5; i++){
            System.out.println("Nome: ");
            nome = teclado.nextLine();
            System.out.println("Salario: ");
            salario = teclado.nextDouble();
            teclado.nextLine();
            lisaEmp.add(new Empregado(nome, salario));
        }

        Empregado aux;
        for (int i = 0; i < 5; i ++){
            aux = lisaEmp.get(i);
            System.out.println(aux.getNome());
        }
    }
}
