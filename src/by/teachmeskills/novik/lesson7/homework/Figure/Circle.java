package by.teachmeskills.novik.lesson7.homework.Figure;

import by.teachmeskills.novik.lesson7.homework.Figure.Figure;

public class Circle extends Figure {
int radius;
public Circle(int radius) {
    this.radius=radius;
}
    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getPloshad() {
        return Math.PI*radius*radius;
    }

}
