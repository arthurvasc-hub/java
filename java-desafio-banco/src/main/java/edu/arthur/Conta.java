package edu.arthur;

public abstract class Conta implements Iconta{

    protected static int SEQUENCIAL = 1;
    protected static int CONTA_PADRAO = 1;

    protected int conta;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        this.conta = SEQUENCIAL++;
        this.agencia = CONTA_PADRAO;
        this.cliente = cliente;

    }

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta conta) {
       this.sacar(valor);
       conta.depositar(valor);
    }

    public void imprimirInfosComuns(){
        System.out.println("Nome do Cliente: " + this.cliente.getNome());
        System.out.println("Numero da conta: " + this.conta);
        System.out.println("Numero da agencia: " + this.agencia);
        System.out.println("Valor do saldo: " + this.saldo);
    }


}
