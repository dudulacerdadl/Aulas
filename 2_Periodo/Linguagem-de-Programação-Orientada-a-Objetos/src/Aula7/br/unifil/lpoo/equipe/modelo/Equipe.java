package Aula7.br.unifil.lpoo.equipe.modelo;

import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Jogador> jogadores;

    public Equipe(String nome) {
        this.nome = nome;
        jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addJogador(Jogador novoJogador) {
        jogadores.add(novoJogador);
    }

    public void removeJogador(Jogador novoJogador) {
        jogadores.remove(novoJogador);
    }

    public String listarJogadores() {
        String saida = "";
        Jogador auxJogador;
        for (int i = 0; i < jogadores.size(); i++) {
            auxJogador = jogadores.get(i);
            saida += auxJogador.getNome() + '\n';
        }
        return saida;
    }

    public Jogador getJogador(String nome) {
        Jogador auxJogador;
        for (int i = 0; i < jogadores.size(); i++) {
            auxJogador = jogadores.get(i);
            if (nome.equals(auxJogador.getNome())) {
                return auxJogador;
            }
        }
        return null;
    }

}
