package by.teachmeskills.novik.lesson10.homework;


import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        String str = getStr();
        String[] arr = str.split(" ");
        int max = arr[0].length();
        int min = arr[0].length();
        String maximum = arr[0];
        String minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i].length()) {
                max = arr[i].length();
                maximum = arr[i];
            }
            if (min >= arr[i].length()) {
                min = arr[i].length();
                minimum = arr[i];
            }
        }
        System.out.println("The longest last word: " + maximum + ", the shortest last word: " + minimum);
    }

    private static String getStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        return str;
    }
}
