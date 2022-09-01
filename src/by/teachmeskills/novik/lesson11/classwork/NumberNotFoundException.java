package by.teachmeskills.novik.lesson11.classwork;

public class NumberNotFoundException extends Exception{  //here we create our mistake. constructor
    public NumberNotFoundException(String str) {
        super("Attention, it is not a number: " + str);

    }
    public NumberNotFoundException(String str, Throwable exception) {
        super("Attention, it is not a number: " + str, exception); //we want message with reason

    }
}
