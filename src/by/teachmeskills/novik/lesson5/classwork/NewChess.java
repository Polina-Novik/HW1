package by.teachmeskills.novik.lesson5.classwork;

import java.util.Arrays;

public class NewChess {
    public static void main(String[] args) {
    int i,j;
    String[][] arr = new String[8][8];
arr[0][0]="W";
    for (i = 1; i < arr.length; i++) {
        if (arr[i-1][0]=="W"){
            arr[i][0]="B";}
        else { arr[i][0]="W";}
        for (j = 1; j < arr[i].length; j++) {
            if (arr[i][j-1]=="W"){
                arr[i][j]="B";}
            else { arr[i][j]="W";}
        }
        System.out.println(Arrays.toString(arr[i]));
    }
}
}
