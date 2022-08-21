package by.teachmeskills.novik.lesson7.homework.figure;

public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getPloshad() {
        double p = (a + b + c) * 0.5;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
