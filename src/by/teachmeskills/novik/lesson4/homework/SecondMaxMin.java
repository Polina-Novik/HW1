package by.teachmeskills.novik.lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SecondMaxMin {
    public static void main(String[] args) {
        int i;
        int summ;
        System.out.println("Enter the size of the array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        Random r = new Random();
        for (i = 0, summ = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            summ += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        float average = (float) summ / size;
        int max = arr[0];
        int min = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("Max: " + max + ", Min: " + min + ", average: " + average);
    }
}
