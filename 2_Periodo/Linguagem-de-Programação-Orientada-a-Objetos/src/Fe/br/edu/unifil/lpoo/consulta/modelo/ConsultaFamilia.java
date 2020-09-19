package Fe.br.edu.unifil.lpoo.consulta.modelo;

public class ConsultaFamilia extends Consulta{

    @Override
    public double getValorCon() {
        if (getNumDep() > 2){
            return super.getValorCon() - (super.getValorCon() * 50 / 100);
        }else{
            return super.getValorCon();
        }
    }

}