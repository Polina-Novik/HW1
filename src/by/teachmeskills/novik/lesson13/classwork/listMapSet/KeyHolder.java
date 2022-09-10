package by.teachmeskills.novik.lesson13.classwork.listMapSet;

public class KeyHolder <T> { //t for univerlality
    private T value;
    public KeyHolder() {

    }
    public KeyHolder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
