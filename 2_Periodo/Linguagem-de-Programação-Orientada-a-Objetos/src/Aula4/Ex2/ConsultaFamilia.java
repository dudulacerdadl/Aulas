package Aula4.Ex2;

public class ConsultaFamilia extends Consulta {

    public ConsultaFamilia(String nome, String matricula, int numeroDependentes, int anoInclusao, double valorConsulta) {
        super(nome, matricula, numeroDependentes, anoInclusao, valorConsulta);
    }

    @Override
    public double getValorConsulta() {
        if (getNumeroDependentes() > 2) {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.5);
        }
        return super.getValorConsulta();
    }
}
