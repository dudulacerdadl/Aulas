package Aula8.br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta {

    @Override
    public double getValorConsulta() {
        if (getNumeroDependentes() > 2) {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.5);
        }
        return super.getValorConsulta();
    }
}
