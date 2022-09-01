package by.teachmeskills.novik.lesson11.homework.second;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Sorry, this password does not meet the requirements");
    }
}
