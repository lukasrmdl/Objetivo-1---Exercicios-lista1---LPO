package controller;

import model.Funcionario;
import model.Produto;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario("Lukas Raphael", 1200.80);
        Funcionario funcionario3 = new Funcionario("Hawallos josue", 1280.80);
        Funcionario funcionario4 = new Funcionario("Eliane do santos", 1250.80);
        Funcionario funcionario5 = new Funcionario("Gelsimar duarte", 1800.80);


        //impressoes

        System.out.println(funcionario1);
        System.out.println(funcionario2);

        //produto 1

        funcionario1.setNomeF("Eduardo Teixeira");
        funcionario1.setSalario(1300.30);


        System.out.println(funcionario1.getNomeF());
        System.out.println(NumberFormat.getCurrencyInstance().format(funcionario1.getSalario()));

        //produto 2

        System.out.println(funcionario2.getNomeF());
        System.out.println(NumberFormat.getCurrencyInstance().format(funcionario2.getSalario()));

        //coleções

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        System.out.println(funcionarios);

        //terceiro funcionario da lista
        System.out.println(funcionarios.get(2));
    }
}