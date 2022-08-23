package conta;

import associados.Cliente;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("<<< Informações Conta poupança: >>>");
        infosConta();
    }
}
