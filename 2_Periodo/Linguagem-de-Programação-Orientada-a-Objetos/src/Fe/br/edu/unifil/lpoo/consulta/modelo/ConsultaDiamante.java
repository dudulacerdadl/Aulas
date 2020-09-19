package Fe.br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaDiamante extends Consulta{

    @Override
    public double getValorCon() {
        return super.getValorCon() - (super.getValorCon() * 40 / 100);
    }

}