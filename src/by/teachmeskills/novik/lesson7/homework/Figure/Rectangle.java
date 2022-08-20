package by.teachmeskills.novik.lesson7.homework.Figure;

import by.teachmeskills.novik.lesson7.homework.Figure.Figure;

public class Rectangle extends Figure {
    int a;
    int b;
    public Rectangle(int a,int b) {
        this.a=a;
        this.b=b;
    }
    @Override
    public double getPerimeter() {
        return 2*a+2*b;
    }

    @Override
    public double getPloshad() {
        return a*b;
    }
}
