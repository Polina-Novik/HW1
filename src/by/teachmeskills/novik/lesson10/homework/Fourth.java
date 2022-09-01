package by.teachmeskills.novik.lesson10.homework;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        System.out.println("What word should be checked?");
        int choose = getChoose(scanner, arr);
        String[] letterArr = arr[choose - 1].split("");
        int count = 0;
        getPalindrome(letterArr, count);
    }

    private static void getPalindrome(String[] letterArr, int count) {
        for (int i = 0, j = letterArr.length - 1; i < letterArr.length; i++, j--) {
            if (letterArr[i].equals(letterArr[j])) {
                count++;
            } else continue;
        }
        if (count == letterArr.length) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word is not a palindrome");
        }
    }

    private static int getChoose(Scanner scanner, String[] arr) {
        int choose = scanner.nextInt();
        while (choose > arr.length) {
            System.out.println("Mistake, repeat");
            choose = scanner.nextInt();
        }
        return choose;
    }
}
