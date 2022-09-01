package by.teachmeskills.novik.lesson11.homework.first;

public class NoFiveException extends Exception {
    public NoFiveException() {
        super("Attention, this document number starts not with 5555!!!");

    }
}
