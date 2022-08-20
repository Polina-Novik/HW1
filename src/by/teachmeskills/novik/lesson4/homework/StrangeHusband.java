package by.teachmeskills.novik.lesson4.homework;

public class StrangeHusband {
    public static void main(String[] args) {
        float path = 1;
        float km = 1;
        for (int N = 2, a=1; N <= 100; N++) {
            a = a * (-1);
            path += 1.0 / N;
            km += 1.0 / N * a;
        }
        System.out.println("Distance from home: " + km);
        System.out.println("Common path:" + path);
    }
}
