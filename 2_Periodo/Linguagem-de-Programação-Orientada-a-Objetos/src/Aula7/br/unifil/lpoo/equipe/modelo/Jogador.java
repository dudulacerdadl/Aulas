package Aula7.br.unifil.lpoo.equipe.modelo;

public class Jogador {
    private String nome;
    private String posicao;

    public Jogador (String novoNome, String novaPosisao) {
        this.nome = novoNome;
        this.posicao = novaPosisao;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}
