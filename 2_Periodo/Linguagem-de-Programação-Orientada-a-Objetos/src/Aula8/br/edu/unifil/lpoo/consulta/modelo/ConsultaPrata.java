package Aula8.br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta {

    @Override
    public double getValorConsulta() {
        return super.getValorConsulta() - (super.getValorConsulta() * 0.2);
    }
}