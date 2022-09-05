package by.teachmeskills.novik.lesson10.homework;


import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        String[] arr = str.split("");
        String newString = arr[0] + arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i];
            newString += arr[i];
        }
        System.out.println(newString);
    }
}
