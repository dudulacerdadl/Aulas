package Prova.questao1;

public class ProfessorDE extends Professor{
    private int qntLicenca;

    public ProfessorDE(String nome, double salario, String matricula, int qntLicenca) {
        super(nome, salario, matricula);
        this.qntLicenca = qntLicenca;
    }

    public int getQntLicenca() {
        return qntLicenca;
    }

    public void setQntLicenca(int qntLicenca) {
        this.qntLicenca = qntLicenca;
    }
}
