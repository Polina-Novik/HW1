package by.teachmeskills.novik.lesson6.classwork;

//обычно сначала переменные потом конструкторы потом иетоды
public class Triangle {


    private double a; //спереди можно поставить public or private or protected, private - контролируем как кто-то меняет это знач
    private double b; //было публик поменяли на приват


    private double c;
    int coefficient;

    public void setA(double a) {
        if (a < 0) { //чтоб сторона не была меньше 0
            this.a = 0;
        } else
            this.a = a;
    }

    public double getA() {
        if (a < 0) {
            return 0;
        }
        return a;
    } //делают чтобы контролить изм переменной. если не хотим чтобы меньше 0

    public Triangle() {//это свой конструктор, можно правой мышкой клацнуть сам заполнит а б це
        this.a = 3; //this показываетчто это переменные этого класса, тут и без него норм, в мейне так не писать, ищет в этом классе, не статик
        this.b = 4;
        this.c = 5;
    }

    public Triangle(double a, double b, double c) { //он видит что трианглы разные, но везде должно быть дубл,в том же порядке
        this.a = a; //присваиваем а к а
        this.b = b;
        this.c = c; //если приват можносоздать только заполненный треугольник
        this.incrementA(); //шо бы а и c было больше чем введено на 1, и эту фигню можн везд встав
    }

    public double getPerimetr() {
        return this.a + this.b + this.c; //чтоб программа не ругалась
    }
//ща подсказку вставим context это обычная практика

    /**
     * блаблабла
     *
     * @param coefficient
     * @return блаблабла
     */
    public double getMultiplyPerimetr(int coefficient) {
        this.coefficient = coefficient; //это необязательно? больше 7 параметров ругается
        //надо больше создаем класс cash кладем параметры туда
        return this.getPerimetr() * coefficient;

    }

    @Override
    public String toString() { //шо бы стринг раб в тест по верхней строчке пкм и генерат и стринг
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", coefficient=" + coefficient +
                '}';
    }

    private void incrementA() {
        this.a++;
        this.c++;
    }
}

