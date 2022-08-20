package by.teachmeskills.novik.lesson7.homework.Figure;

import by.teachmeskills.novik.lesson7.homework.Figure.Figure;

public class Triangle extends Figure {
int a;
int b;
int c;
int h;
public Triangle(int a,int b,int c){
    this.a=a;
    this.b=b;
    this.c=c;

}

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getPloshad(){ double p=(a+b+c)*0.5;

       return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
