package by.teachmeskills.novik.lesson4.homework;

import java.util.Random;
import java.util.Scanner;

public class FirstDelete {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i, j, s;
        Random r = new Random();
        System.out.print("The original array: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
            System.out.print("arr[" + i + "]=" + arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Enter the number to remove from the array");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        do {
            for (i = 0, s = 0; i < arr.length; i++) {
                if (arr[i] != a) {
                    s++;
                }
            }
            if (s == 10) {
                {
                    System.out.println("Incorrect value. Re-enter.");
                    a = scanner.nextInt();
                }
            }
        }
        while (s == 10);
        System.out.println("New array: ");
        for (i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                j = j + 1;
            }
        }
        int[] NewArr = new int[arr.length - j];
        for (i = 0, j = 0; j < NewArr.length; i++) {
            if (arr[i] != a) {
                NewArr[j] = arr[i];
                j++;
            }
        }
        for (i = 0; i < NewArr.length; i++) {
            System.out.print("NewArr[" + i + "]=" + NewArr[i] + ", ");

        }
    }
}