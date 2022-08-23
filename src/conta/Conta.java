package conta;

import associados.Cliente;

public class Conta implements InterConta{

    protected static final int AGENCIA_PADRAO = 715;
    protected static  int NUMERO_AGENCIA = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;

    protected double saldo;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = NUMERO_AGENCIA++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    @Override
    public void infosConta() {
        System.out.println("Nome titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
