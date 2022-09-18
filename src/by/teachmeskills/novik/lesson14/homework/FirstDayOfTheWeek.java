package by.teachmeskills.novik.lesson14.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class FirstDayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        LocalDate localDate = LocalDate.of(year, month, day);
        System.out.println(localDate.getDayOfWeek());
    }
}
