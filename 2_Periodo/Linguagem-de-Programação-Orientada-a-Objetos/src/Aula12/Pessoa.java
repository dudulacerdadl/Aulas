package Aula12;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract String getDescricao();

    public String getNome() {
        return nome;
    }
}
