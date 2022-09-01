package by.teachmeskills.novik.lesson10.homework;

import java.util.Scanner;

public class Third3 {
    public static void main(String[] args) {
        String str = getStr();
        String[] arr = str.split(" ");
        int[] repeat = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            divideIntoLetters(arr, repeat, i);
        }
        int maxi = repeat[0];
        String maximum = arr[0];
        maximum = wordWithTheMostRepeatingLetter(arr, repeat, maxi, maximum);
        System.out.println(maximum);
    }

    private static String wordWithTheMostRepeatingLetter(String[] arr, int[] repeat, int maxi, String maximum) {
        for (int i = 0; i < arr.length; i++) {
            if (maxi <= repeat[i]) {
                maxi = repeat[i];
                maximum = arr[i];
            }
        }
        return maximum;
    }

    private static void divideIntoLetters(String[] arr, int[] repeat, int i) {
        if (arr[i].length() == 1) {
            repeat[i] = 0;
        } else {
            String[] littleArr = arr[i].split("");
            int[] repeatArr = new int[littleArr.length];
            lookingForRepeatingLetter(littleArr, repeatArr);
            int max = repeatArr[0];
            max = theMostRepeatingLetter(repeatArr, max);
            repeat[i] = max;
        }
    }

    private static int theMostRepeatingLetter(int[] repeatArr, int max) {
        for (int m = 0; m < repeatArr.length; m++) {
            if (max < repeatArr[m]) {
                max = repeatArr[m];
            }
        }
        return max;
    }

    private static void lookingForRepeatingLetter(String[] littleArr, int[] repeatArr) {
        for (int j = 0; j < littleArr.length; j++) {
            int count = 0;
            for (int k = 0; k < littleArr.length; k++) {
                if (littleArr[j].equals(littleArr[k])) {
                    count++;
                }
            }
            repeatArr[j] = count;
        }
    }

    private static String getStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        return str;
    }
}
