package Aula4.Ex2;

public class ConsultaOuro extends Consulta {

    public ConsultaOuro(String nome, String matricula, int numeroDependentes, int anoInclusao, double valorConsulta) {
        super(nome, matricula, numeroDependentes, anoInclusao, valorConsulta);
    }

    @Override
    public double getValorConsulta() {
        if (this.getAnoInclusao() <= 2000) {
            return 0;
        } else {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.3);
        }
    }
}
