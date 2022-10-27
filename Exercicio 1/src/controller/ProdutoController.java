package controller;

import java.sql.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoController {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Farinha", "Sao joao", 4.70, 1000);
        Produto produto3 = new Produto("Café", "Narita", 8.70, 900);
        Produto produto4 = new Produto("Feijão", "Qualy", 6.70, 300);
        Produto produto5 = new Produto("Arroz", "Mondano", 7.70, 600);

        //impressoes

        System.out.println(produto1);
        System.out.println(produto2);

        //produto 1

        produto1.setNome("Óleo de Soja");
        produto1.setDescricao("qualit");
        produto1.setValor(8.30);
        produto1.setEstoque(10000);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(NumberFormat.getCurrencyInstance().format(produto1.getValor()));
        System.out.println(produto1.getEstoque());

        //produto 2

        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(NumberFormat.getCurrencyInstance().format(produto2.getValor()));
        System.out.println(produto2.getEstoque());

        //coleções

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        System.out.println(produtos);

        //terceiro produto da lista
        System.out.println(produtos.get(2));

    }
}