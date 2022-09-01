package by.teachmeskills.novik.lesson11.classwork;

public class TooBigNumberException extends Exception{  //here we create our mistake. constructor
    public TooBigNumberException(int inte) {
        super("Attention, this number is too big!!!Higher than 1000!!!! "+ inte);

    }
}
