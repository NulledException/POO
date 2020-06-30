package Aula16.exercicios.ex03.conta;

public class ContaBancaria {
    
    private String numero;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String numero) {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(valor > saldo){
            throw new SaldoInsuficienteException();
        }
        saldo -= valor;
    }
}