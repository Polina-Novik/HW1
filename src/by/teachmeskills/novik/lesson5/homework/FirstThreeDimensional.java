package by.teachmeskills.novik.lesson5.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstThreeDimensional {
    public static void main(String[] args) {
        int[][][] arr = new int[2][3][4];
        int i, j, k;
        Random r = new Random();
        System.out.println("initial array");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                for (k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = r.nextInt(100);
                    System.out.print("arr[" + i + "," + j + "," + k + "]=" + arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println(Arrays.deepToString(arr));
        }
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                for (k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = arr[i][j][k] + a;
                    System.out.print("arr[" + i + "," + j + "," + k + "]=" + arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
