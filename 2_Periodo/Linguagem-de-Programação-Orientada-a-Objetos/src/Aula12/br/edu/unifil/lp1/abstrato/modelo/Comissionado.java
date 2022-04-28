package Aula12.br.edu.unifil.lp1.abstrato.modelo;

public class Comissionado extends Funcionario{
    private double comissao;
    private int qntVendas;

    public Comissionado(String nome, int matricula, double salario, double comissao, int qntVendas) {
        super(nome, matricula, salario);
        this.comissao = comissao;
        this.qntVendas = qntVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public double getGanhoMensal() {
        return getSalario() + (getComissao() * getQntVendas());
    }

    @Override
    public String getDescricao() {
        return "O funcionário " + getNome() + " tem um ganho mensal de: R$" + getGanhoMensal();
    }
}
