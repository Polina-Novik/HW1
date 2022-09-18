package by.teachmeskills.novik.lesson14.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondTuesday {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        if (DayOfWeek.MONDAY.equals(currentDate.getDayOfWeek())) {
            LocalDate nextDate = currentDate.plusDays(1L);
            System.out.println(nextDate);
        } else if (DayOfWeek.TUESDAY.equals(currentDate.getDayOfWeek())) {
            LocalDate nextDate = currentDate.plusDays(7L);
            System.out.println(nextDate);
        } else if (DayOfWeek.WEDNESDAY.equals(currentDate.getDayOfWeek())) {
            LocalDate nextDate = currentDate.plusDays(6L);
            System.out.println(nextDate);
        } else if (DayOfWeek.THURSDAY.equals(currentDate.getDayOfWeek())) {
            LocalDate nextDate = currentDate.plusDays(5L);
            System.out.println(nextDate);
        } else if (DayOfWeek.FRIDAY.equals(currentDate.getDayOfWeek())) {
            LocalDate nextDate = currentDate.plusDays(4L);
            System.out.println(nextDate);
        } else if (DayOfWeek.SATURDAY.equals(currentDate.getDayOfWeek())) {
            LocalDate nextDate = currentDate.plusDays(3L);
            System.out.println(nextDate);
        } else if (DayOfWeek.SUNDAY.equals(currentDate.getDayOfWeek())) {
            LocalDate nextDate = currentDate.plusDays(2L);
            System.out.println(nextDate);
        }

    }
}

