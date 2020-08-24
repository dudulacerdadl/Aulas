package Aula4.Ex2;

public class ConsultaDiamante extends Consulta {

    public ConsultaDiamante(String nome, String matricula, int numeroDependentes, int anoInclusao, double valorConsulta) {
        super(nome, matricula, numeroDependentes, anoInclusao, valorConsulta);
    }

    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 0.4);
    }
}
