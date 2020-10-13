package Prova1.br.edu.unifil.lpoo.universidade.modelo;

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

    @Override
    public String getDados() {
        return "Nome: " + super.getNome() + "\nMatrícula: " + super.getMatricula() + "\nSalário: " + super.getSalario() + "\nQuantidade de prêmios: " + this.getQntLicenca() + "\n\n";
    }
}
