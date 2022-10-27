package controller;

import model.Carro;
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarroController {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Audi", "Sedã Audi RS6", 2010);
        Carro carro3 = new Carro("Fiat", "Uno Mille", 2010);
        Carro carro4 = new Carro("Ford", "Focus Flex", 2008);
        Carro carro5 = new Carro("General Motors", "sedã Malibu", 2008);

        //impressoes

        System.out.println(carro1);
        System.out.println(carro2);

        //carro 1

        carro1.setMarca("BMW");
        carro1.setModelo("5 GT");
        carro1.setAnoFabricacao(2010);

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        //produto 2

        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        //coleções

        List<Carro> carros = new ArrayList<>();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);
        carros.add(carro5);
        System.out.println(carros);

        //terceiro carro da lista
        System.out.println(carros.get(2));

    }
}
