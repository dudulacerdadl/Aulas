package AulaFinal;

public class Aviao {
    private String nomeVoo;
    private int quantPassageiros;
    private char estado;
    private int quantMaxima;

    public Aviao (String novoNomeVoo , int novaQuantMaxima){
        this.setNomeVoo(novoNomeVoo);
        this.setQuantMaxima(novaQuantMaxima);
        this.setEstado('P');
    }
    public String getNomeVoo() {
        return this.nomeVoo;
    }
    public int getQuantPassageiros() {
        return this.quantPassageiros;
    }
    public char getEstado() {
        return this.estado;
    }
    public int getQuantMaxima() {
        return this.quantMaxima;
    }
    public void setNomeVoo(String novoNomeVoo) {
        if (novoNomeVoo.trim().equals("")) {
            this.nomeVoo = novoNomeVoo;
        }
    }
    public void setQuantPassageiros(int novaQuantPassageiros) {
        if (novaQuantPassageiros < this.quantMaxima) {
            this.quantPassageiros = novaQuantPassageiros;
        }
    }
    public void setEstado(char novoEstado) {
        if (novoEstado == 'P' || novoEstado == 'V'){
            this.estado = novoEstado;
        } else {
            System.out.println("[ERRO] Estado inválido!");
        }
    }
    public void setQuantMaxima(int novaQuantMaxima) {
        if (novaQuantMaxima > 0) {
            this.quantMaxima = novaQuantMaxima;
        } else {
            System.out.println("[ERRO] Valor inválido!");
        }
    }

    public void Decolar(){
        if (this.getEstado() == 'P'){
            this.setEstado('V');
            System.out.println("Avião decolado!");
        } else {
            System.out.println("[ERRO]O avião já está voando!");
        }
    }
    public void Pousar(){
        if (this.getEstado() == 'V'){
            this.setEstado('P');
            System.out.println("Avião pousado!");
        } else {
            System.out.println("[ERRO]O avião já está pousado!");
        }
    }
    public void Embarcar(){
        if (this.getEstado() == 'P' && this.getQuantPassageiros() < this.getQuantMaxima()){
            this.setQuantPassageiros(this.getQuantPassageiros() + 1);
        } else {
            System.out.println("[ERRO]Você não pode embarcar!");
        }
    }
    public void Desembarcar(){
        if (this.getEstado() == 'P' && this.getQuantPassageiros() > 0){
            this.setQuantPassageiros(this.getQuantPassageiros() - 1);
        } else {
            System.out.println("[ERRO]Você não pode desembarcar!");
        }
    }
}
