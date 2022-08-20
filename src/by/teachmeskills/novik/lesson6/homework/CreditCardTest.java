package by.teachmeskills.novik.lesson6.homework;

import java.util.Scanner;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard c1 = new CreditCard("1", 100);
        CreditCard c2 = new CreditCard("2", 100);
        CreditCard c3 = new CreditCard("3", 100);
        System.out.println("To change the balance enter 1, to check the balance enter 2, to exit enter 3");
        Scanner scanner = new Scanner(System.in);
        int enter = scanner.nextInt();
        do {
            switch (enter) {
                case 2:
                    System.out.println("Balance on your bank cards:");
                    System.out.println(c1);
                    System.out.println(c2);
                    System.out.println(c3);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Mistake, repeat input");
                    break;
                case 1:
                    System.out.println("Enter account");
                    int ac = scanner.nextInt();
                    while (ac < 1 || ac > 3) {
                        System.out.println("Mistake, repeat input");
                        ac = scanner.nextInt();
                    }
                    System.out.println("To add enter 1, to remove enter 2");
                    int change = scanner.nextInt();
                    while (change < 1 || change > 2) {
                        System.out.println("Mistake, repeat input");
                        change = scanner.nextInt();
                    }
                    System.out.println("Enter value");
                    int value = scanner.nextInt();
                    switch (change) {
                        case 1:
                            switch (ac) {
                                case 1:
                                    c1.addMoney(value);
                                    break;
                                case 2:
                                    c2.addMoney(value);
                                    break;
                                case 3:
                                    c3.addMoney(value);
                                    break;
                            }
                            break;
                        case 2:
                            switch (ac) {
                                case 1:
                                    c1.removeMoney(value);
                                    break;
                                case 2:
                                    c2.removeMoney(value);
                                    break;
                                case 3:
                                    c3.removeMoney(value);
                                    break;
                            }

                    }
                    break;
            }
            System.out.println("To change the balance enter 1, to check the balance enter 2, to exit enter 3");
            enter = scanner.nextInt();
        }
        while (enter != 3);
    }
}
