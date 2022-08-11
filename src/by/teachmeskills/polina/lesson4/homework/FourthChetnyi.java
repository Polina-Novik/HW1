package by.teachmeskills.polina.lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FourthChetnyi {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array, more than 5, less than or equal to 10");
        Scanner scanner=new Scanner(System.in);
        int size= scanner.nextInt();
        int size1; int i; int j;
        while (size<=5 || size>10) {
                System.out.println("Incorrect value. Re-enter.");
                size1= scanner.nextInt();
                size = size1;
        }
        int[] arr=new int[size];
        Random r = new Random();
        for (i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
                    }
        System.out.println("The original array: " + Arrays.toString(arr));
        for (i = 0,j=0; i < arr.length; i++) {
            if (arr[i]%2==1) {j=j+1;}}
        int[] NewArr = new int[arr.length - j];
        for (i = 0, j=0; j < NewArr.length; i++) {
            if (arr[i]%2==0) {NewArr[j]=arr[i]; j++;
            }}
        if (j!=0){
        System.out.println("New array: " + Arrays.toString(NewArr));}
        else {
            System.out.println("Sorry, no even numbers");}
    }
}
