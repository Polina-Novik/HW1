package by.teachmeskills.polina.lesson5.classwork;

import java.util.Arrays;

public class Chess {
    public static void main(String[] args) {
        int i,j=0;
        String[][] arr = new String[8][8];

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = "B";
                } else {
                    arr[i][j] = "W";
                }
            }
                System.out.println(Arrays.toString(arr[i]));
        }
    }
}
