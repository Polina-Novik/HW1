package by.teachmeskills.novik.lesson17.classwork;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    public static void main(String[] args) {
        String testString="this is 678910 my string_!!!!!!!!! 12345";
        Pattern pattern=Pattern.compile("\\d+"); //regular expression that we want to check, for numbers
        Matcher matcher=pattern.matcher(testString);
        System.out.println(matcher.matches()); //return false, we have words. check, is string full correlating to regex
    if (matcher.find()) { //if there is our pattern, first numbers sout
        System.out.println(matcher.start()+" " +matcher.end()); //number of position
        System.out.println(matcher.group()); //grouping all numbers that correlate
    }
        System.out.println("aaaaaa");
        while (matcher.find()) { //all correlations, the last
            System.out.println(matcher.start()+" " +matcher.end());
            System.out.println(matcher.group());
        }
       // matcher.results().filter() like a stream
        System.out.println("aaaaaaaaaaaaaaaaaa");
        matcher.reset(); //to use matcher second time
        matcher.results().forEach(matchResult -> System.out.println(matchResult.group()));
        System.out.println(Arrays.asList(testString.split("\\W+"))); //deleted all except letters, numbers, _
        System.out.println(matcher.replaceAll(""));
    }
}
