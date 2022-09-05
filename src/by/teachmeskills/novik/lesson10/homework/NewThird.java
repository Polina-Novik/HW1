package by.teachmeskills.novik.lesson10.homework;

import java.util.Scanner;

public class NewThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        long[] counting = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            counting[i] = arr[i].chars().distinct().count();
        }
        String minimum = arr[0];
        long min =counting[0];
        for (int m = 0; m < arr.length; m++) {
            if (min > counting[m]) {
                minimum = arr[m];
                min=counting[m];
            }
        }
        System.out.println(minimum);

    }
}
