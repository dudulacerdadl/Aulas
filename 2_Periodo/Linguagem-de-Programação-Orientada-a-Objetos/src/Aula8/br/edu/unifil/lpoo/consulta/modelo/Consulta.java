package Aula8.br.edu.unifil.lpoo.consulta.modelo;

public class Consulta {
    private String nome;
    private String matricula;
    protected int numeroDependentes;
    protected int anoInclusao;
    protected double valorConsulta;
    protected String tipoPlano;

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

    public String getTipoPlano() {
        return tipoPlano;
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

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}
