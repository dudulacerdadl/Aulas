package Aula8;

public class Conta {
    int numero;
    String titular;
    double saldo;

    public Conta(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
        }
    }

    public double obterSaldo(){
        return  this.saldo;
    }
}
