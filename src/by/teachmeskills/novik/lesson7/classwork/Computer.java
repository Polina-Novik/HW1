package by.teachmeskills.novik.lesson7.classwork;

public abstract class Computer { //абстракт чтоб не создать комп, комп слишк абстрактно
    protected int cost; //видно только всем наследникам и в этом классе
    String model;
    int screenSize;
public Computer(String model) { //будет в лаптопе  тоже требоваться модель
    this.model=model;
}
    public int getCost() {
        return cost;
    }

    public abstract void setCost(int cost);//каждому ребенку юудет цена, как пока не знаем. Наследнику обязательно, если
    //надо классы наслед. Но не всегда................................

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    //и тут надо внутри класс ноутбуки, с жизнью батареи, с компом общее НАСЛЕДОВАНИЕ родитель и ребенок
}
