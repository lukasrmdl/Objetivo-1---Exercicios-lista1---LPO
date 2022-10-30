package controller;

import model.Carro;
import model.Conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContaController {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(1200.80);
        Conta conta3 = new Conta(1300.80);
        Conta conta4 = new Conta(1400.80);
        Conta conta5 = new Conta(1500.80);

        //impressoes

        System.out.println(conta1);
        System.out.println(conta2);

        //produto 1

        conta1.deposita(900.00);

        System.out.println(conta1.getSaldo());


        //produto 2

        System.out.println(conta2.getSaldo());
        conta2.saca(0.80);
        conta2.atualiza(10);

        //coleções

        List<Conta> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        System.out.println(contas);

        //terceira conta da lista
        System.out.println(contas.get(2));

        //map
        Map<String, Conta> contasMap = new HashMap<>(); 
        contasMap.put(conta1.getSaldo(), conta1);
        contasMap.put(conta2.getSaldo(), conta2);
        contasMap.put(conta3.getSaldo(), conta3);
        contasMap.put(conta4.getSaldo(), conta4);
        contasMap.put(conta5.getSaldo(), conta5);
        System.out.printLn(contasMap);

    }
}
