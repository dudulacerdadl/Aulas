package Aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
    private Scanner leia;

    public Exemplo() {
        leia = new Scanner(System.in);
    }

    public void carregaArray (int[] arr) throws InputMismatchException {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = leia.nextInt();
        }
    }
}
