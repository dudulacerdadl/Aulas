package Aula3;

public class Gerente extends Empregado {
    private double bonus;

    public Gerente(String novoNome, double novoSalario, double novoBonus) {
        super(novoNome, novoSalario);
        this.bonus = novoBonus;
    }

    @Override
    public double getSalario() {
        return salario + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
