package Prova1.br.edu.unifil.lpoo.universidade.controle;

import Prova1.br.edu.unifil.lpoo.universidade.modelo.*;
import Prova1.br.edu.unifil.lpoo.universidade.modelo.Professor;
import Prova1.br.edu.unifil.lpoo.universidade.modelo.ProfessorDE;
import Prova1.br.edu.unifil.lpoo.universidade.modelo.ProfessorHorista;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Professor> listaProfessores;

    public Controle() {
        listaProfessores = new ArrayList<>();
    }

    public void icluirProfessor(String nome, double salario, String matricula, double horasTrabalhadas) {
        ProfessorHorista profAux = new ProfessorHorista(nome, salario, matricula, horasTrabalhadas);
        listaProfessores.add(profAux);
    }

    public void icluirProfessor(String nome, double salario, String matricula, int qntLicenca) {
        ProfessorDE profAux = new ProfessorDE(nome, salario, matricula, qntLicenca);
        listaProfessores.add(profAux);
    }

    public String listarProfessores() {
        Professor auxProf;
        String saida = "";
        for (int i = 0; i < listaProfessores.size(); i++) {
            auxProf = listaProfessores.get(i);
            saida += "Nome: " + auxProf.getNome() + "\nSalário: " + auxProf.getSalario() + "\n\n";
        }
        return saida;
    }

    public String mostrarDados() {
        Professor auxProf;
        String saida = "";
        for (int i = 0; i < listaProfessores.size(); i++) {
            auxProf = listaProfessores.get(i);
            saida += auxProf.getDados();
        }
        return saida;
    }
}
