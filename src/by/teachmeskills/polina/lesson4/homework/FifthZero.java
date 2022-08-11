package by.teachmeskills.polina.lesson4.homework;

import java.util.Arrays;
import java.util.Random;

public class FifthZero {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] NewArr = new int[10];
        int i;
        Random r = new Random();
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        if (i%2==0) {
            NewArr[i]=arr[i];
        }
        else {NewArr[i]=0;}
        }
        System.out.println("The original array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(NewArr));

    }
}
