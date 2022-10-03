package by.teachmeskills.novik.lesson17.classwork;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain2 {
    public static void main(String[] args) {
        List<String> testList = Arrays.asList("123455", "1a1", "b1aa1", "12b2", "11a ","8","325","3244", "43,3"); //list of strings
        Pattern pattern = Pattern.compile("\\b+$", Pattern.CASE_INSENSITIVE); //word's border
        //  Pattern pattern = Pattern.compile("\\W+$", Pattern.CASE_INSENSITIVE); //we see space
       // Pattern pattern = Pattern.compile("\\w+$", Pattern.CASE_INSENSITIVE); //a-zA-Z0-9_, not space not ,
        //  Pattern pattern = Pattern.compile("\\D\\S+$", Pattern.CASE_INSENSITIVE); //not space not number. starts not from number, ends not space
        //Pattern pattern = Pattern.compile("\\D\\s+$", Pattern.CASE_INSENSITIVE); //ends with space
        // Pattern pattern = Pattern.compile("\\D+$", Pattern.CASE_INSENSITIVE); //d - numbers, D - Not numbers
       // Pattern pattern = Pattern.compile("([A-Z]|[3-5])$", Pattern.CASE_INSENSITIVE); // | - or
        //Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$", Pattern.CASE_INSENSITIVE); //delete a-z - no 1a1, but insensitive - register doesn't matter
        //Pattern pattern = Pattern.compile("^[^25]+$"); //don't show all that contaims 2 and five - end start
        // Pattern pattern = Pattern.compile("[^25]+$"); //don't show all that contains 2and 5 in the end
        //Pattern pattern = Pattern.compile("25+$"); to find 25
       // Pattern pattern = Pattern.compile("[25]+$"); //seek 2 and 5 with + - all last variants
        //Pattern pattern = Pattern.compile("\\d?$"); //? exist or not 1 symbol
        //Pattern pattern = Pattern.compile("^\\d+$"); //end and start with a number,not a space; + means from 1 to infinity; * - 0 or nothingto infinity
        for (String current: testList) {
            Matcher matcher = pattern.matcher(current);
            if (matcher.find()) {
                System.out.println(matcher.start()+ " " + matcher.end()); //to see spaces
                System.out.println(matcher.group());
            }
        }
        //^a - begins from a
        //a$ - a in the end

    }
}