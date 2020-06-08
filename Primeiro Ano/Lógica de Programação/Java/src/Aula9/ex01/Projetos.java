package Aula9.ex01;

public class Projetos {
    private int hora;
    private double custoHora;
    private String nome;

    public Projetos (String nome){
        this.nome = nome;
        this.custoHora = 10.5;
    }

    public Projetos (String nome, double custoHora){
        this.nome = nome;
        this.custoHora = custoHora;
    }

    public void registrarHoras(int hora){
        this.hora += hora;
    }

    public double getCustoAtual(){
        return (this.hora * this.custoHora);
    }

    public String getNome(){
        return this.nome;
    }

    public double getCustoHora(){
        return this.custoHora;
    }

    public int getHora(){
        return this.hora;
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
}
