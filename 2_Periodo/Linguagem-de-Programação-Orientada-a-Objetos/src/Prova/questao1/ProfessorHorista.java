package Prova.questao1;

public class ProfessorHorista extends Professor {
    private double horasTrabalhadas;

    public ProfessorHorista(String nome, double salario, String matricula, double horasTrabalhadas) {
        super(nome, salario, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getSalario() {
        return super.getSalario() * getHorasTrabalhadas();
    }
}
