package by.teachmeskills.polina.lesson5.classwork;

import java.util.Arrays;

public class Sotka {
    public static void main(String[] args) {
        int[][]arr=new int[10][10];
        int counter = 1;
        for(int x=0;x< arr.length;x++){
            for (int j=0;j<arr[x].length;j++) {
                arr[x][j] = counter++;
                   } System.out.println(Arrays.toString(arr[x]));}
    }
}
