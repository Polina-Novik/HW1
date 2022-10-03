package by.teachmeskills.novik.lesson7.homework.register;

public class Register {
    private int position;
    private Documentt[] arr;

    public Register(int size) {
        position = 0;
        arr = new Documentt[size];
    }

    public void addDocument(Documentt document) {
        if (position < arr.length) {
            arr[position] = document;
            position++;
        }
    }

    public void print() {
        for (int i = 0; i < position; i++) {
            arr[i].print();
        }
    }
}
