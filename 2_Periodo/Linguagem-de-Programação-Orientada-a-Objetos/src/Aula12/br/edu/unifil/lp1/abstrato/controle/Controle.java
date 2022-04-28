package Aula12.br.edu.unifil.lp1.abstrato.controle;

import Aula12.br.edu.unifil.lp1.abstrato.modelo.*;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Funcionario> listaEmp;

    public Controle() {
        listaEmp = new ArrayList<>();
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario, double comissao, int qntVendas) {
        Comissionado func = new Comissionado(nome, matricula, salario, comissao, qntVendas);
        listaEmp.add(func);
        System.out.println("Cadastrado com sucesso!");
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario, double hrsTrab) {
        Horista func = new Horista(nome, matricula, salario, hrsTrab);
        listaEmp.add(func);
        System.out.println("Cadastrado com sucesso!");
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario) {
        Mensalista func = new Mensalista(nome, matricula, salario);
        listaEmp.add(func);
        System.out.println("Cadastrado com sucesso!");
    }

    public void cadastrarFuncionario(String nome, int matricula, double salario, int qtdProd) {
        Producao func = new Producao(nome, matricula, salario, qtdProd);
        listaEmp.add(func);
        System.out.println("Cadastrado com sucesso!");
    }

    public String listarFuncionario() {
        Funcionario auxFunc;
        String saida = "";
        for (int i = 0; i < listaEmp.size(); i++) {
            auxFunc = listaEmp.get(i);
            saida += "Funcionário: " + auxFunc.getNome() + "; Matrícula: " + auxFunc.getMatricula() + "; Salário: " + auxFunc.getGanhoMensal() + "\n";
        }
        return saida;
    }

    public Funcionario getFuncionario(int matricula) {
        Funcionario auxFunc;
        Funcionario out = null;
        for (int i = 0; i < listaEmp.size(); i++) {
            auxFunc = listaEmp.get(i);
            if (auxFunc.getMatricula() == matricula) {
                out = auxFunc;
                break;
            }
        }
        return out;
    }

    public void excluirFuncionario(Funcionario func) {
        listaEmp.remove(func);
    }
}
