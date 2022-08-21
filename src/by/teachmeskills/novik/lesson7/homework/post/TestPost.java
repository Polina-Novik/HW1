package by.teachmeskills.novik.lesson7.homework.post;

public class TestPost {
    public static void main(String[] args) {
        Postable[] arr = new Postable[3];
        arr[0] = new Director();
        arr[1] = new Worker();
        arr[2] = new Accountant();
        for (Postable p : arr) {
            p.post();
        }
    }
}
