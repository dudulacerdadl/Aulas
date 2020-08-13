package Aula3;

public class Pessoa {
    private String nome;
    private String endereco;

    public Pessoa(String novoNome){
        this.nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
