package Aula12;

public abstract class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getDescrica() {
        return "É um estudante do curso: " + curso;
    }
}
