package Aula12;

public class Horista extends Empregado {
    private double horasTrab;

    public Horista(String nome, int matricula, double horasTrab) {
        super(nome, matricula);
        this.horasTrab = horasTrab;
    }

    @Override
    public String getDescricao() {
        return "É um horista com " + horasTrab + " horas";
    }

    @Override
    public void getDadosEmpregado() {
        System.out.println(horasTrab);
    }
}
