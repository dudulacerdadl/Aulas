package Aula12;

public abstract class Empregado extends Pessoa {
    private int matricula;

    public Empregado(String nome, int matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String getDescricao() {
        return null;
    }

    public abstract void getDadosEmpregado();
}
