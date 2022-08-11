package by.teachmeskills.polina.lesson5.homework;

import java.util.Arrays;
import java.util.Random;

public class FourthSum {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Random r=new Random();
        int summ=0;
        for (int i = 0;i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10);
                summ=summ+arr[i][j];
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("sum of array elements: "+ summ);
    }
}
