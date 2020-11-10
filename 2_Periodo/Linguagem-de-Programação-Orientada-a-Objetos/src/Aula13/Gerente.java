package Aula13;

public class Gerente extends Funcionario implements Acesso {
    private String senha;

    public double getBonificacao(){
        return salario * 0.4;
    }

    public boolean isLiberado(String senha){
        System.out.println("Gerente");
        if (this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
