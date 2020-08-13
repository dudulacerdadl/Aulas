package Aula2;

public class Aluno extends Pessoa {
    private int matricula;
    private double[] notas;

    public Aluno(String nome){
        super(nome);
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
}
