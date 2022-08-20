package by.teachmeskills.novik.lesson4.homework;

import java.util.Random;
import java.util.Scanner;

public class ZeroNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, j;
        Random r = new Random();
        System.out.println("enter a number from 0 to 15");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a <= 0 || a > 15) {
            System.out.println("Incorrect value. Re-enter.");
            a = scanner.nextInt();
                    }
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(16);
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
        for (i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println(a + " found at index " + i);
            } else
                if (arr[i] != a) {
                    j++;
                }

        }
        if (j == 10) {
            System.out.println(a + " not found");
        }

    }
}


