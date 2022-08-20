package by.teachmeskills.novik.lesson5.homework;

import java.util.Arrays;
import java.util.Random;

public class FifthDiagonals {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int i, j;
        Random r = new Random();
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.print("First diagonal: ");
        for (i = 0, j = 0; i < arr.length; i++, j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
        System.out.print("Second diagonal: ");
        for (i = 0, j = arr[i].length - 1; i < arr.length; i++, j--) {
            System.out.print(arr[i][j] + " ");
        }
    }
}
