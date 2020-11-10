package Aula14;

public abstract class Conta {
    private String titular;
    private double saldo;
    protected static double valorReferencia = 200;

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

}
