package model;

public class Conta {
    private Double saldo;


    //construtores
    public Conta() {

    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    //Getters

    public double getSaldo() {
        return saldo;
    }

    //Setters

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
        double valorTemp = this.saldo - valor;
        if(valorTemp < 0) {
            System.out.println("Não há saldo suficiente para esse saque. Saldo= " + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("\nSaque realizado com sucesso. Saldo atual= " + this.saldo);
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
        System.out.println("Saldo atualizado pela taxa. Saldo atual=" + this.saldo);
    }

    @Override
    public String toString() {
        return "\nConta_Lista1 [Saldo=" + saldo + "]";
    }
}
