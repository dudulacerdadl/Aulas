package Aula9.ex01;

public class Projetos {
    private int hora;
    private double custoHora;
    private String nome;

    public Projetos (String novoNome){
        this.nome = novoNome;
        this.custoHora = 10.5;
    }
    public Projetos (String novoNome, double novoCustoHora){
        this.nome = novoNome;
        this.custoHora = novoCustoHora;
    }
    public int getHora(){
        return this.hora;
    }
    public double getCustoHora(){
        return this.custoHora;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String novoNome){
        if (!novoNome.equals("")){
            this.nome = novoNome;
        }
    }
    public void setCustoHora(double novoCustoHora){
        if (novoCustoHora > 0){
            this.custoHora = novoCustoHora;
        }
    }

    public void registrarHoras(int novaHora){
        this.hora += novaHora;
    }
    public double getCustoAtual(){
        return (this.hora * this.custoHora);
    }
}
