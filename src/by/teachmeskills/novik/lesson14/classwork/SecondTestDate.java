package by.teachmeskills.novik.lesson14.classwork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class SecondTestDate {
    public static void main(String[] args) throws ParseException {
        Date currentDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM      * yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/**yy");
        System.out.println(format.format(currentDate));
        System.out.println(format1.format(currentDate));
//       Date newDate = format.parse("22 02 2022"); ?
//        System.out.println(newDate);
        Date myDate = new Date(2022, 5, 3); //better not to use, old
        System.out.println(myDate);
        LocalDate myCurrentDate = LocalDate.parse("2002-02-22");
        System.out.println(myCurrentDate);
        LocalDate myDate2=LocalDate.of(2022,10,10);
        System.out.println(myDate2);
    }
}
