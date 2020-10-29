package Aula12.br.edu.unifil.lp1.abstrato.modelo;

public abstract class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario(String nome, int matricula, double salario) {
        super(nome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws IllegalArgumentException {
        if (getSalario() <= 0) {
            throw new IllegalArgumentException("[ERRO] Coloque um valor positivo como salário");
        } else {
            this.salario = salario;
        }
    }

    public abstract double getGanhoMensal();
}
