package by.teachmeskills.novik.lesson10.homework;


import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        String str = getStr();
        String[] arr = str.split(" ");
        String maximum = arr[0];
        String minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum.length() <= arr[i].length()) {
                maximum = arr[i];
            }
            if (minimum.length() >= arr[i].length()) {
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
