package by.teachmeskills.novik.lesson6.classwork;

public class TestClass {
    public static void main(String[] args) {
        Triangle t=new Triangle(); //сделать треугольник t, короче констурктор шаблон
       // System.out.println(t.a);
        //t.a=3; //сторона а=3
       // t.b=5;
        //t.c=4; //если б в шаблоне триангл был периметр,можно было бы его посчит
        System.out.println(t.getPerimetr());
        System.out.println(t.getMultiplyPerimetr(3)); //здесь подсветка блаблабла подсказки вставляем
        System.out.println(t.getA());
        System.out.println(t); //распечататет т в строчку, не обязательно в скобках писать toString
           Triangle t1 = new Triangle (3,4,5);
        System.out.println(t1);
    }
}
