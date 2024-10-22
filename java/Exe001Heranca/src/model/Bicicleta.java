package model;

import absModel.Transporte;

public class Bicicleta extends Transporte {
    private int ano;
    private String modelo;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void numeroDeMarchas() {
        System.out.println("Oleo trocado");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }
}
