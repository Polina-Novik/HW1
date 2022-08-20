package by.teachmeskills.novik.lesson3.homework;

public class Squares_7 {
    public static void main(String[] args) {
        for (int i = 10, j = i*i; i<=20; ++i, j = i*i) {
            System.out.print( i + "^2=" + j + ", ");
        }
    }
}
