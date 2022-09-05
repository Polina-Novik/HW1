package by.teachmeskills.novik.lesson10.homework.first;


import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document number in format xxxx-yyy-xxxx-yyy-xyxy. x-number,y-letter.");
        String str = scanner.nextLine();
        Number number = new Number(str);
        Number.Numbers(str);
        Number.Letters(str);
        Number.abc(str);
        Number.Five(str);
        Number.get1a2b(str);
    }
}
