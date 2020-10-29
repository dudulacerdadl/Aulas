package Aula12.br.edu.unifil.lp1.abstrato.modelo;

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
