package by.teachmeskills.polina.lesson5.homework;

import java.util.Arrays;
import java.util.Random;

public class ThirdMultiplication {
    public static void main(String[] args) {
        int i,j;
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];
        Random r=new Random();
        System.out.println("Initial arrays:");
        for (i = 0;i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = r.nextInt(10);
                arr2[i][j] = r.nextInt(10);
            }
            System.out.println(Arrays.toString(arr1[i]) + "         " + Arrays.toString(arr2[i]));
        }
        System.out.println("New array:");
        for (i = 0;i < arr1.length; i++) {
            for (j = 0; j < arr1[i].length; j++) {
                arr3[i][j] = arr1[i][j] * arr2[i][j];
            }
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
