import administrativo.Banco;
import associados.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente luan = new Cliente();
        luan.setNome("Luan");

        Cliente joao = new Cliente();
        joao.setNome("Joao");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        Cliente jose = new Cliente();
        jose.setNome("Jose");

        Cliente bruna = new Cliente();
        bruna.setNome("Bruna");

       Conta cpb =  new ContaCorrente(bruna);
        cpb.depositar(100);
        cpb.infosConta();

        ContaCorrente cc1 = new ContaCorrente(luan);
        cc1.infosConta();
        ContaCorrente cc2 = new ContaCorrente(joao);
        cc2.infosConta();

        ContaPoupanca cp1 = new ContaPoupanca(maria);
        cp1.infosConta();

        Conta cc = new ContaCorrente(jose);
        cc.depositar(100);
        cc.infosConta();

        //Operações(depositar, sacar e transferir)

        //cc1.depositar(100);
        //cc1.infosConta();
        //cc1.transferir(50,cp1);
        //cc1.transferir(50, cc2);

        //cc2.imprimirExtrato();
        //cc1.infosConta();

        //cp1.infosConta();
        //cc1.infosConta();
        System.out.println("<<<Banco>>>");
        Banco sicred = new Banco();
        sicred.setNome("Sicred");
        System.out.println(sicred.getNome());
        List <Conta> contasSicred = new ArrayList<>();
        contasSicred.add(cpb);
        contasSicred.add(cc1);
        contasSicred.add(cc2);
        contasSicred.add(cp1);
        contasSicred.add(cc);

        //Passando a list de contas para o objeto banco
        sicred.setContas(contasSicred);
        //System.out.println(sicred.getContas());
        sicred.contasBanco(contasSicred);


    }
}
