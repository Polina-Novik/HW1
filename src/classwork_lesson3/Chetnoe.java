package classwork_lesson3;

import java.util.Random;

public class Chetnoe {
    public static void main(String[] args) {
               Random r = new Random();
        int randomValue = r.nextInt();
        System.out.println(randomValue);
       if (randomValue%2==0) {
           System.out.println("chetnoe");
       }
else System.out.println("nechetnoe");
    }
}
