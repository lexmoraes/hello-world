package model;

import iModel.IFiguraGeometrica;

public class Quadrado implements IFiguraGeometrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        return lado * lado;
    }

    @Override
    public int getPerimetro() {
        return lado * 4;
    }
}
