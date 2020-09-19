package Fe.br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaOuro extends Consulta {

    @Override
    public double getValorCon() {
        if (getAno() <= 2000){
            return 0;
        } else{
            return super.getValorCon() - (super.getValorCon() * 30 / 100);
        }
    }

}