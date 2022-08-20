package by.teachmeskills.novik.lesson6.homework;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ATMtest {
    public static void main(String[] args) {
        ATM a = new ATM();
        System.out.println("This ATM only accepts 20, 50, 100");
        System.out.println("To add money to the machine press 1, to withdraw money press 2, to view the amount of money in the machine press 3, to exit press 4");
        Scanner scanner = new Scanner(System.in);
        int press = scanner.nextInt();
        while (press != 4) {
            switch (press) {
                case 1:
                    System.out.println("1. Add 20");
                    System.out.println("2. Add 50");
                    System.out.println("3. Add 100");
                    int choose= scanner.nextInt();
                    while (choose < 1 || choose > 3) {
                        System.out.println("Mistake, repeat input");
                        choose = scanner.nextInt();
                    }
                    System.out.println("How many?");
                    int amount=scanner.nextInt();
                    while (amount<=0) {
                        System.out.println("Value must be more than 0");
                        amount=scanner.nextInt();
                    }
                    int tw=0,fi=0,hu=0;
                    switch (choose) {
                        case 1: tw=amount; break;
                        case 2: fi=amount; break;
                        case 3: hu=amount; break;
                        }
                        a.addMoney(tw,fi,hu);
                    break;
                case 2:
                    System.out.println("how much money do you want to withdraw?");
                    int value= scanner.nextInt();
                    a.removeMoney(value);
                    break;
                case 3: a.getSum();
                break;
                default:
                    System.out.println("Mistake");
                    break;
                case 4: return;
            }
            System.out.println("To add money to the machine press 1, to withdraw money press 2, to view the amount of money in the machine press 3, to exit press 4");
            press = scanner.nextInt();
        }
    }
}
