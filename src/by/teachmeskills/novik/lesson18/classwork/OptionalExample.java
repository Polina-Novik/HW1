package by.teachmeskills.novik.lesson18.classwork;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> opt;  //optional - may be empty
        opt = Optional.of("here");
        opt = Optional.empty();
        //String str=null;
        /*if (str!=null) {
            System.out.println(str.length());*/
    }

    public static void printStrLength(String str) { //without optional will be exception
        Optional<String> nextOpt = Optional.ofNullable(str);
        nextOpt.ifPresent((val -> System.out.println(val.length())));
        nextOpt.orElseThrow();
        nextOpt.filter(x->x.length()>3);
        // System.out.println(str.length());
        nextOpt.ifPresentOrElse(val -> System.out.println(val),
                () -> System.out.println(0));
    }
}
