package by.teachmeskills.polina.lesson5.homework;

import java.util.Arrays;
import java.util.Random;

public class SixthIncrease {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int i,j;
        Random r=new Random();
        for (i = 0;i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
            }
            System.out.print(Arrays.toString(arr[i])+ "             ");
            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
