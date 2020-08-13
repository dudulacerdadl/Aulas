package Aula3;

public class Principal {
    public static void main(String[] args) {
        Empregado emp = new Empregado("Edson", 1000);
        Gerente ger = new Gerente("José", 5000, 500);

        System.out.println(ger.getNome() + " " + ger.getSalario());
    }
}
