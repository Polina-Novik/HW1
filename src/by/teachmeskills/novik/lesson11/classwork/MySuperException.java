package by.teachmeskills.novik.lesson11.classwork;

public class MySuperException extends Exception{  //here we create our mistake. constructor
    public MySuperException(int a,int b) {
        super("Attention, this is my exception. you cannot devide"+ a +"/"+b); //super because exception has own constructor

    }
}
