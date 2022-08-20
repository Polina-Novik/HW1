package by.teachmeskills.novik.lesson7.classwork;

public final class Laptop extends Computer{ //в компе нужен геттер и сеттер
    //финал запрещает менять класс другим, никто не может от него наслед
    public Laptop (int batteryLife) {
        super("blablabla"); //вызывает конструктор метода супер, выделить супер и ctrl B ссылка на родителя
        this.batteryLife=batteryLife;
    }
   /*final*/ int batteryLife; //только 1 раз можно присвоить значение. пр один раз 3, потом 5 никак
    public void setCost(int cost) {
        /*было до протектед super.setCost(cost+5);*/ //зис и супер методы разн. если не супер, будет бесконечный цикл. метод вызовет сам себя потом сам себя и тд
    this.cost=cost+5;
    }
  /*  public void test() { было до протектед
        this.setCost(5);
        super.setCost(10);
    }*/
}
