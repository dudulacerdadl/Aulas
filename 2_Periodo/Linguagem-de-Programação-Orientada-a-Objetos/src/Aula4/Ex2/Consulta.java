package Aula4.Ex2;

public class Consulta {
    private String nome;
    private String matricula;
    private int numeroDependentes;
    private int anoInclusao;
    private double valorConsulta;

    public Consulta(String nome, String matricula, int numeroDependentes, int anoInclusao, double valorConsulta) {
        this.nome = nome;
        if (matricula.length() == 5) {
            this.matricula = matricula;
        } else {
            System.out.println("Digite uma matricula com 5 caracteres!");
        }
        this.numeroDependentes = numeroDependentes;
        this.anoInclusao = anoInclusao;
        this.valorConsulta = valorConsulta;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public int getAnoInclusao() {
        return anoInclusao;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        if (matricula.length() == 5) {
            this.matricula = matricula;
        } else {
            System.out.println("Digite uma matricula com 5 caracteres!");
        }
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public void setAnoInclusao(int anoInclusao) {
        this.anoInclusao = anoInclusao;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
