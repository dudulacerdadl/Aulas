package Aula3;

public class Empregado extends Pessoa {
    protected double salario;

    public Empregado(String novoNome, double novoSalario) {
        super(novoNome);
        this.salario = novoSalario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
