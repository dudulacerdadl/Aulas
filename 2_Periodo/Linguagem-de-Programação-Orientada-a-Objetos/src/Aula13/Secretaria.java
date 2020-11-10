package Aula13;

public class Secretaria extends Funcionario {
    private boolean bilingue;

    public double getBonificacao(){
        return salario * 0.2;
    }

    public boolean isBilingue() {
        return bilingue;
    }

    public void setBilingue(boolean bilingue) {
        this.bilingue = bilingue;
    }
}
