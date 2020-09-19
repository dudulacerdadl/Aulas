package Fe.br.edu.unifil.lpoo.consulta.modelo;

public class Consulta {
    private String nome;
    private String matricula;
    private int tipo;
    protected int numDep;
    protected int ano;
    protected double valorCon;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.length() == 5){
            this.matricula = matricula;
        }else{
            System.out.println("A matrícula deve ter 5 caracteres.");
        }
    }

    public int getNumDep() {
        return numDep;
    }

    public void setNumDep(int numDep) {
        this.numDep = numDep;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorCon() {
        return valorCon;
    }

    public int getTipo(){
        return tipo;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public void setValorCon(double valorCon) {
        this.valorCon = valorCon;
    }
}