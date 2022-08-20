package by.teachmeskills.novik.lesson4.homework;

import java.util.Arrays;
import java.util.Random;

public class ThirdTwoArrays {
    public static void main(String[] args) {
        int summ1, summ2;
        int i;
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Random r = new Random();
        for (i = 0, summ1 = 0, summ2 = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(100);
            summ1 = summ1 + arr1[i];
            arr2[i] = r.nextInt(100);
            summ2 = summ2 + arr2[i];
        }
        System.out.println("First array:" + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));
        float a1 = (float) summ1 / 5;
        float a2 = (float) summ2 / 5;
        System.out.println("Average 1: " + a1 + ", average 2: " + a2);
        if (a1 < a2) {
            System.out.println(a1 + "<" + a2);
        } else
            if (a1 == a2) {
                System.out.println(a1 + "=" + a2);
            } else {
                System.out.println(a1 + ">" + a2);
            }

    }
}
