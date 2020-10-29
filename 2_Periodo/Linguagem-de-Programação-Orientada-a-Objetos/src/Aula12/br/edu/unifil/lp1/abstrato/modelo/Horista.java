package Aula12.br.edu.unifil.lp1.abstrato.modelo;

public class Horista extends Funcionario {
    private double hrsTrab;

    public Horista(String nome, int matricula, double salario, double hrsTrab) {
        super(nome, matricula, salario);
        this.hrsTrab = hrsTrab;
    }

    public double getHrsTrab() {
        return hrsTrab;
    }

    public void setHrsTrab(double hrsTrab) {
        this.hrsTrab = hrsTrab;
    }

    @Override
    public double getGanhoMensal() {
        return getSalario() * getHrsTrab();
    }

    @Override
    public String getDescricao() {
        return "O funcionário " + getNome() + " tem um ganho mensal de: R$" + getGanhoMensal();
    }
}
