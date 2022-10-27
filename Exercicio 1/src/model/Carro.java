package model;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabricacao;

    //construtores
    public Carro() {

    }

    public Carro(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    //Getters

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    //Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "\nCarro_Lista1 [Marca=" + marca + ", Modelo=" + modelo + ", Ano de fabricação=" + anoFabricacao + "]";
    }

}
