package by.teachmeskills.novik.lesson11.classwork;


import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        int value=0;
        try {
            value=getIntFromString(str);
            if (value>1000) {
                throw new TooBigNumberException(value); //add catch nnkkla
            }
        } catch (NumberNotFoundException e) {
            value++;
            e.printStackTrace();
        } catch (TooBigNumberException e) {
            value=1000;
            System.out.println("ooops i did it again");
            e.printStackTrace();
        }

    }

    private static int getIntFromString(String str) throws  NumberNotFoundException  {
      // if (str.isEmpty()) throw new NumberNotFoundException(str);
        try {
           return Integer.parseInt(str);
       } catch (NumberFormatException e) {

          // throw new NumberNotFoundException(str);
            throw new NumberNotFoundException(str); //with exception we see prehistory of this mistake
       }

    }
}
