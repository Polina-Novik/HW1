package by.teachmeskills.novik.lesson14.classwork;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.Month;
import java.util.Date;

public class TestDateMain {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();

     LocalDate nextDate=currentDate.plusDays(1L); //L=long
        System.out.println(currentDate.isAfter(nextDate));
        System.out.println(currentDate.isBefore(nextDate));
        System.out.println(currentDate.getDayOfWeek());
        System.out.println(currentDate.getDayOfYear());
        System.out.println(currentDate.getDayOfMonth());
        System.out.println(currentDate.getEra());
        if (Month.SEPTEMBER.equals(currentDate.getMonth())) {
            System.out.println("Today is september");
        }
        if (DayOfWeek.MONDAY.equals(currentDate.getDayOfWeek())) {
            System.out.println("Today is monday");
        }
        Date date=new Date(0);
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(currentDate);
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}
