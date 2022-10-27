package model;

public class Funcionario {

    private String nomeF;
    private Double salario;

    //construtores
    public Funcionario() {

    }

    public Funcionario(String nomeF, double salario) {
        this.nomeF = nomeF;
        this.salario = salario;
    }

    //Getters

    public String getNomeF() {
        return nomeF;
    }

    public double getSalario() {
        return salario;
    }

    //Setters

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nFuncionario_Lista1 [nome=" + nomeF +  ", Salario=" + salario + "]";
    }

}
