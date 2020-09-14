package Aula8.br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta {

    @Override
    public double getValorConsulta() {
        if (this.getAnoInclusao() <= 2000) {
            return 0;
        } else {
            return super.getValorConsulta() - (super.getValorConsulta() * 0.3);
        }
    }
}
