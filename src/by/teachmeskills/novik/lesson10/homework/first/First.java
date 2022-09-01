package by.teachmeskills.novik.lesson10.homework.first;


import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy. x-number,y-letter.");
        String str = scanner.nextLine();
        Number number = new Number(str);
        String[] arr = Number.str.split("-");
        System.out.println(arr[0] + " " + arr[2]);
        System.out.println(arr[0] + "-***-" + arr[2] + "-***-" + arr[4]);
        StringBuilder builder = new StringBuilder();
        builder.append(arr[4]);
        builder.deleteCharAt(0);
        builder.deleteCharAt(1);
        String xyxy = builder.toString();
        System.out.println(arr[1].toLowerCase() + "/" + arr[3].toLowerCase() + "/" + xyxy.toLowerCase());
        StringBuilder b = new StringBuilder();
        b.append(arr[1] + "/").append(arr[3] + "/").append(xyxy);
        String letters = b.toString();
        System.out.println("Letters:" + letters.toUpperCase());
        System.out.println("Document number contains abc or ABC:" + Number.str.toLowerCase().contains("abc"));
        System.out.print("Document number starts from 5555: ");
        if (0 == "5555".compareTo(arr[0])) {
            System.out.println("true");
        } else System.out.println("false");
        System.out.print("Document number ends with 1a2b: ");
        if (0 == "1a2b".compareTo(arr[4])) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
