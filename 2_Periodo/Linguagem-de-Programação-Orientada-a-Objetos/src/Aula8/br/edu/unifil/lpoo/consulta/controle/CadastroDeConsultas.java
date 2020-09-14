package Aula8.br.edu.unifil.lpoo.consulta.controle;

import Aula8.br.edu.unifil.lpoo.consulta.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroDeConsultas {
    private ArrayList<Consulta> listaConsulta;

    public CadastroDeConsultas() {
        listaConsulta = new ArrayList<>();
    }

    public void novaConsulta (String novoNome, String novaMatricula, int novoNumeroDependentes, int novoAnoInclusao, double novoValorConsulta) {
        Scanner leia = new Scanner(System.in);
        Consulta auxConsulta = null;

        System.out.println("Escolha um tipo de plano para a sua consulta: ");
        System.out.println("[1] Prata");
        System.out.println("[2] Ouro");
        System.out.println("[3] Diamante");
        System.out.println("[4] Família");
        String tipoPlano = leia.nextLine();

        if (Integer.parseInt(tipoPlano) == 1) {
            auxConsulta = new ConsultaPrata();
            auxConsulta.setTipoPlano("Prata");
        } else if (Integer.parseInt(tipoPlano) == 2) {
            auxConsulta = new ConsultaOuro();
            auxConsulta.setTipoPlano("Ouro");
        } else if (Integer.parseInt(tipoPlano) == 3) {
            auxConsulta = new ConsultaDiamante();
            auxConsulta.setTipoPlano("Diamante");
        } else if (Integer.parseInt(tipoPlano) == 4) {
            auxConsulta = new ConsultaFamilia();
            auxConsulta.setTipoPlano("Família");
        } else {
            System.out.println("[ERRO] Digite um número válido!");
        }
        auxConsulta.setNome(novoNome);
        auxConsulta.setMatricula(novaMatricula);
        auxConsulta.setNumeroDependentes(novoNumeroDependentes);
        auxConsulta.setAnoInclusao(novoAnoInclusao);
        auxConsulta.setValorConsulta(novoValorConsulta);

        listaConsulta.add(auxConsulta);
        System.out.println("Nova consulta marcada com sucesso! Dados:");
        System.out.println("Nome: " + auxConsulta.getNome());
        System.out.println("Matrícula: " + auxConsulta.getMatricula());
        System.out.println("Número de Dependentes: " + auxConsulta.getNumeroDependentes());
        System.out.println("Ano de Inclusão: " + auxConsulta.getAnoInclusao());
        System.out.println("Valor da Consulta: " + auxConsulta.getValorConsulta());
        System.out.println("Tipo do plano: " + auxConsulta.getTipoPlano());
    }

    public String listarConsultas(String tipoConsulta) {
        String saida = "";
        for (int i = 0; i < listaConsulta.size(); i++) {
            Consulta auxConsulta = listaConsulta.get(i);
            if (auxConsulta.getTipoPlano().equals(tipoConsulta)){
                saida += "Nome: " + auxConsulta.getNome() + "\n" + "Matricula: " + auxConsulta.getMatricula() + "\n";
            }
        }
        return saida;
    }

    public String totalConsultas (String tipoConsulta) {
        String saida;
        int cont = 0;
        for (int i = 0; i < listaConsulta.size(); i++) {
            Consulta auxConsulta = listaConsulta.get(i);
            if (auxConsulta.getTipoPlano().equals(tipoConsulta)) {
                cont ++;
            }
        }
        saida = "O total de consultas realizadas com o plano " + tipoConsulta + " foi de " + cont;
        return saida;
    }

    public String valorConsultas (String tipoConsulta) {
        String saida;
        double total = 0;
        int cont = 0;
        for (int i = 0; i < listaConsulta.size(); i++) {
            Consulta auxConsulta = listaConsulta.get(i);
            if (auxConsulta.getTipoPlano().equals(tipoConsulta)) {
                total += auxConsulta.getValorConsulta();
            }
        }
        saida = "O valor total das consultas foi de R$" + total;
        return saida;
    }

}
