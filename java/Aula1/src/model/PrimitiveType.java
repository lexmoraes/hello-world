package model;

public class PrimitiveType {
    // tipos primitivos
    private byte a;
    private short b;
    private int c;
    private long d;
    private float e;
    private double f;
    private char g;
    private boolean h;

    public byte getA() {
        return a;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB(short b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public float getE() {
        return e;
    }

    public void setE(float e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public char getG() {
        return g;
    }

    public void setG(char g) {
        this.g = g;
    }

    public boolean isH() {
        return h;
    }

    public void setH(boolean h) {
        this.h = h;
    }

    public void show() {
        System.out.println("type byte | Value = " + a);
        System.out.println("type short | Value = " + b);
        System.out.println("type int | Value = " + c);
        System.out.println("type long | Value = " + d);
        System.out.println("type float | Value = " + e);
        System.out.println("type double | Value = " + f);
        System.out.println("type char | Value = " + g);
        System.out.println("type boolean | Value = " + h);
    }
}
