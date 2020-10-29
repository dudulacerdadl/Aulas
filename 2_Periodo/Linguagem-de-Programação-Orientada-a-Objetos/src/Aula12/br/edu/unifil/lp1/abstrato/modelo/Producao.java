package Aula12.br.edu.unifil.lp1.abstrato.modelo;

public class Producao extends Funcionario{
    private int qtdProd;

    public Producao(String nome, int matricula, double salario, int qtdProd) {
        super(nome, matricula, salario);
        this.qtdProd = qtdProd;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQtdProd(int qtdProd) {
        this.qtdProd = qtdProd;
    }

    @Override
    public double getGanhoMensal() {
        return getSalario() * getQtdProd();
    }

    @Override
    public String getDescricao() {
        return "O funcionário " + getNome() + " tem um ganho mensal de: R$" + getGanhoMensal();
    }
}
