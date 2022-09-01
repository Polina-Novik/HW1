package by.teachmeskills.novik.lesson11.homework.first;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy. x-number,y-letter.");
        String str = scanner.nextLine();
        Number number=new Number(str);
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
        System.out.print("Document number contains abc or ABC: ");
        try {
            System.out.println(getABC(str));
        } catch (NotAbcException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.print("Document number starts from 5555: ");
        try {
            System.out.println(getFive(arr[0]));
        } catch (NoFiveException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.print("Document number ends with 1a2b: ");
        try {
            System.out.println(getAB(arr[4]));
        } catch (No1a2bException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static boolean getABC(String str) throws NotAbcException {
        if (!Number.str.toLowerCase().contains("abc")) throw new NotAbcException();
        return Number.str.toLowerCase().contains("abc");
    }

    private static boolean getFive(String str) throws NoFiveException {
        if (0 != "5555".compareTo(str)) throw new NoFiveException();
        return (0 == "5555".compareTo(str));
    }

    private static boolean getAB(String str) throws No1a2bException {
        if (0 != "1a2b".compareTo(str)) throw new No1a2bException();
        return (0 == "1a2b".compareTo(str));
    }
}
