package Aula13;

public class Fornecedor implements Acesso {
    private String nome;

    public boolean isLiberado(String senha){
        System.out.println("Fornecedor");
        if (senha.equals("senha2020")){
            return true;
        }else{
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
