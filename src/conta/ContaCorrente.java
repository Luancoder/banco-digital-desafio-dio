package conta;

import associados.Cliente;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("<<< Informações Conta corrente: >>> ");
        infosConta();
    }
}
