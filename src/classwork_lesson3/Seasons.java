package classwork_lesson3;

import java.util.Random;

public class Seasons {
    public static void main(String[] args) {
        Random r = new Random();
        int randomValue = r.nextInt(12) ;
        int a= ++randomValue;
        System.out.println(a);
        if (a<=2) {
            System.out.println("Winter");
        }
        else {if (a<=5) {
            System.out.println("весна"); }
            else {if (a<=8) {
                System.out.println("Summer");}
                else {if (a<=11) {
                    System.out.println("Autumn");}
                    else
                        System.out.println("Winter");
                    }
                }
            }
        }
    }

