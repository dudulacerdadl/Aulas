package Prova.questao1;

public class Professor {
    private String nome;
    private double salario;
    private String matricula;

    public Professor(String nome, double salario, String matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

    public Professor() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
