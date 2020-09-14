package Aula7.br.unifil.lpoo.equipe.controle;

import Aula7.br.unifil.lpoo.equipe.modelo.Equipe;
import Aula7.br.unifil.lpoo.equipe.modelo.Jogador;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Jogador> listaJogadores;
    private ArrayList<Equipe> listaEquipes;

    public Controle (){
        listaEquipes = new ArrayList<>();
        listaJogadores = new ArrayList<>();
    }

    public void cadastrarJogador(String nome, String posicao) {
        Jogador auxJogador = new Jogador(nome, posicao);
        listaJogadores.add(auxJogador);
        System.out.println("Jogador(a) " + auxJogador.getNome() + " da posição " + auxJogador.getPosicao() + " foi cadastrado com sucesso!");
    }

    public void cadastrarEquipe(String nome) {
        Equipe auxEquipe = new Equipe(nome);
        listaEquipes.add(auxEquipe);
        System.out.println("A esquipe " + auxEquipe.getNome() + " foi cadastrada com sucesso!");
    }

    public void contratarJogador(String nomeEq, String nomeJog){
        Equipe auxEq;
        for(int i=0; i<listaEquipes.size();i++){
            auxEq = listaEquipes.get(i);
            if (auxEq.getNome().equals(nomeEq)){
                for(int j=0; j < listaJogadores.size(); j++){
                    Jogador auxJog = listaJogadores.get(j);
                    if(auxJog.getNome().equals(nomeJog)){
                        auxEq.addJogador(auxJog);
                        System.out.println("Jogador contratado com sucesso!");
                        break;
                    }
                }
                break;
            } else {
                System.out.println("Digite um nome de equipe válida!");
            }
        }
    }

    public void demitirJogador(String equipe, String nome) {
        for (int i = 0; i < listaEquipes.size(); i++) {
            Equipe auxEquipe = listaEquipes.get(i);
            if (auxEquipe.getNome().equals(equipe)) {
                Jogador auxJogador;
                for (int j = 0; j < listaJogadores.size(); j++) {
                    auxJogador = listaJogadores.get(i);
                    if (auxJogador.getNome().equals(nome)) {
                        auxEquipe.removeJogador(auxJogador);
                        System.out.println("Jogador demitido com sucesso!");
                        break;
                    } else {
                        System.out.println("Digite um nome de jogador válido!");
                    }
                }
                break;
            } else {
                System.out.println("Digite um nome de equipe válida!");
            }
        }
    }

    public String listarJogEquipe(String equipe) {
        String saida = "";
        Equipe auxEquipe;
        for (int i = 0; i < listaEquipes.size(); i++) {
            auxEquipe = listaEquipes.get(i);
            if (auxEquipe.getNome().equals(equipe)) {
                saida = auxEquipe.listarJogadores();
                break;
            } else {
                System.out.println("Digite um nome de equipe válido!");
            }
        }
        return saida;
    }

    public String listarJogPosicao(String posicao) {
        String saida = "";
        for (int i = 0; i < listaJogadores.size(); i++) {
            Jogador auxJogador = listaJogadores.get(i);
            if (auxJogador.getPosicao().equals(posicao)){
                saida += "Jogador: " + auxJogador.getNome() + "\n";
            } else {
                System.out.println("Digite uma posição válida!");
            }
        }
        return saida;
    }
}
