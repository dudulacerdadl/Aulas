package Fe.br.edu.unifil.lpoo.consulta.controle;

import Fe.br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.ArrayList;

public class CadastroDeConsultas {
    private ArrayList<Consulta> listaConsultas;


    public CadastroDeConsultas(){
        listaConsultas = new ArrayList<>();
    }


    public void cadConsulta(int tipo, String nome, double valor, String matricula, int dep, int ano){
        Consulta consulta = null;
        if (tipo == 1){
            consulta = new ConsultaPrata();
            consulta.setTipo(tipo);
        }else if (tipo == 2){
            consulta = new ConsultaOuro();
            consulta.setTipo(tipo);
        }else if (tipo == 3){
            consulta = new ConsultaDiamante();
            consulta.setTipo(tipo);
        }else if (tipo == 4){
            consulta = new ConsultaFamilia();
            consulta.setTipo(tipo);
        }else{
            System.out.println("Esse plano não existe.");
        }
        consulta.setNome(nome);
        consulta.setValorCon(valor);
        consulta.setMatricula(matricula);
        consulta.setAno(ano);
        consulta.setNumDep(dep);
        listaConsultas.add(consulta);
    }

    public String detailsConsulta(int plano){
        String out = "";
        Consulta auxCon;
        for (int i = 0; i<listaConsultas.size(); i++){
            auxCon = listaConsultas.get(i);
            if (auxCon.getTipo() == plano){
                out += auxCon.getNome() + '\n';
            }
        }
        return out;
    }

    public int returnNumCon(int tipo){
        int out = 0;
        int numCon = 0;
        Consulta auxCon;
        for (int i=0; i<listaConsultas.size(); i++){
            auxCon = listaConsultas.get(i);
            if (auxCon.getTipo() == tipo){
                numCon++;

            }
        }
        out = numCon;
        return out;
    }

    public double totalCon(int plano){
        double out = 0.0;
        Consulta auxCon = new Consulta();
        for (int x=0; x<listaConsultas.size(); x++){
            auxCon = listaConsultas.get(x);
            if (auxCon.getTipo() == plano){
                out += auxCon.getValorCon();
            }
        }
        return out;
    }


}