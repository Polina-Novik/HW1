package by.teachmeskills.novik.lesson11.classwork;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws MySuperException{
      /*  Error e; //if we see it, something serious happend, close everything
        Exception ex; //two types:
        RuntimeException rex; //we should not check them. people did them???
        //second exception we should make smth*/
    /*    int first = 2;
        int second=0;
try {
    System.out.println(first/second);
    int[] arr=new int[1];
    System.out.println(arr[2]);
}
catch (ArithmeticException e) or (Exception e) for all exceptions  {
    e.printStackTrace(); //describing mistake
    System.out.println(first/1); //antwort 2
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index out of array");
}
catch (Exception e) {

}
        System.out.println("Hello world"); //no mistakes */
       /* System.out.println(getDivision(2,0));
       more action:runtime exception
       catch*/
        try { //we can put try in try, like with if, but better not
            System.out.println(getDivision(2,0));
        } catch (MySuperException |IOException  e) {
            e.printStackTrace();
            System.out.println("we go away");
            System.out.println( e.getMessage()); //show one line,not big
            System.out.println(e.toString()); //show line with the name of the class
            System.out.println(e.getCause()); //show reason of mistake. null,because we should write interface
          /*  throw new RuntimeException(e);*/

           // throw new RuntimeException(); //better not to add, reason of mistake
            //show message about mistake
        } /*catch (IOException e) {

        }*/
        finally { //not neccecary, we will see it even if there is no mistake
            System.out.println("WE DONE IT!!!!!!!!!!!!");
        }
        System.out.println("we come back");
    }
    //if we want to make a mistake
    private static int getDivision(int a,int b) throws /*ArithmeticException*/ MySuperException, IOException { //we shw that this method throws exception
      if (b==0) throw new /*ArithmeticException("baba")*/ MySuperException(a,b); //describing that b=0==mistake
        //mistake in 40, not in 42. throws - may be a mistake. throw - you call mistake
        if (b==100) throw new MySuperException(a,b);
        return a/b;
        //unchecked 25 p. read
    }
}
