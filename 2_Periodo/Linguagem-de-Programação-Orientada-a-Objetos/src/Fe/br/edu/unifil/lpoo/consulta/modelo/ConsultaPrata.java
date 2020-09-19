package Fe.br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaPrata extends Consulta{

    @Override
    public double getValorCon() {
        return super.getValorCon() - (super.getValorCon() * 20 / 100);
    }
}