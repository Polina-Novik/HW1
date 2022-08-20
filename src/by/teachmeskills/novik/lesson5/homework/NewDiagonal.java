package by.teachmeskills.novik.lesson5.homework;

import java.util.Arrays;
import java.util.Random;

public class NewDiagonal {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int i, j;
        int[] leftDiagonal=new int[4];
        int[] rightDiagonal=new int[4];
        Random r = new Random();
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.print("First diagonal: ");
        for (i = 0; i < arr.length; i++) {
            leftDiagonal[i]=arr[i][i];
            rightDiagonal[i]=arr[3-i][i];
        }
        System.out.println("First diagonal:"+ Arrays.toString(leftDiagonal));
        System.out.println("Second diagonal:"+ Arrays.toString(rightDiagonal));

    }
}
