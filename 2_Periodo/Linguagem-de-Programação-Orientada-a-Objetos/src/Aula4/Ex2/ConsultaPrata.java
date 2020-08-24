package Aula4.Ex2;

public class ConsultaPrata extends Consulta {

    public ConsultaPrata(String nome, String matricula, int numeroDependentes, int anoInclusao, double valorConsulta) {
        super(nome, matricula, numeroDependentes, anoInclusao, valorConsulta);
    }

    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 0.2);
    }
}
