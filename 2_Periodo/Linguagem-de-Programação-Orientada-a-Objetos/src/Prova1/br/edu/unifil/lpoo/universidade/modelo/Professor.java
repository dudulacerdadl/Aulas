package Prova1.br.edu.unifil.lpoo.universidade.modelo;

public class Professor {
    protected String nome;
    protected double salario;
    protected String matricula;

    public Professor(String nome, double salario, String matricula) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
    }

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

    public String getDados() {
        return "Nome: " + this.getNome() + "\n Matrícula: " + this.getMatricula() + "\n Salário: " + this.getSalario() + "\n \n";
    }
}
