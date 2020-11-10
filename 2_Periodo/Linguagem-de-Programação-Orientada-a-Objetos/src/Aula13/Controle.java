package Aula13;

import java.util.ArrayList;

public class Controle {
    private ArrayList<Funcionario> listaFunc;
    private ArrayList<Fornecedor> listaFornec;

    public Controle(){
        listaFunc = new ArrayList<>();
        listaFornec = new ArrayList<>();
    }

    public void inserirFuncionario(Funcionario f){
        listaFunc.add(f);
        System.out.println("Funcionário de matrícula " + f.getMatricula() + " cadastrado com sucesso!");
    }

    public Funcionario getFuncionario(int matricula){
        Funcionario aux;
        for(int i=0; i<listaFunc.size(); i++){
            aux = listaFunc.get(i);
            if (aux.getMatricula() == matricula){
                return aux;
            }
        }
        return null;
    }

    public void inserirFornecedor(Fornecedor fornecedor){
        listaFornec.add(fornecedor);
        System.out.println("Fornecedor cadastrado com sucesso!");
    }

    public Fornecedor getFornecedor(String nome){
        Fornecedor aux;
        for(int i=0; i<listaFornec.size(); i++){
            aux = listaFornec.get(i);
            if (aux.getNome().equals(nome)){
                return aux;
            }
        }
        return null;
    }
}
