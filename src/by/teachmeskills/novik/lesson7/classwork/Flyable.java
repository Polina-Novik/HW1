package by.teachmeskills.novik.lesson7.classwork;

public interface Flyable {
    //void fly();//станд интерфейс, метод не прописн, можно было и др войды сюда доб
    final int myNumber = 0; //файнал серый потому что это по умолч тут
    default void fly() {
        System.out.println(getString() + "I can fly!!!!!!!!!!!!");
    }
    private String getString() { //чтобы убрать дубликаты методов в дефолтных
        return "AAAHHHHHHHH ";
    }
}
/*отличие от абст класса: нет констрктора
* инты менять нельзя, ну переменные
* остальное теперь одинак
* интерфейсов 3 категории: просто ин-с, скок угодно метод
* функциональный @FunctionalInteface только 1 метод: у нас ток летать, но надо без дефаулт
* маркер - пустой и-с, пр выполн действия только с об с маркером, но потом*/