package by.teachmeskills.novik.lesson8.homework.phone;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        System.out.println("First phone: number");
        int number1 = scanner.nextInt();
        System.out.println("Model:");
        String model1 = console.nextLine();
        System.out.println("Weight");
        int weight1 = scanner.nextInt();
        Phone phone1 = new Phone(number1, model1, weight1);
        System.out.println("Second phone: number");
        int number2 = scanner.nextInt();
        System.out.println("Model:");
        String model2 = console.nextLine();
        Phone phone2 = new Phone(number2, model2);
        Phone phone3 = new Phone();
        System.out.println("Your phones:");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        call(r, phone1, phone2, phone3);
        callWithNumber(r, phone1, phone2, phone3);
        System.out.println("Choose phone. Enter 1,2 or 3");
        int choose = scanner.nextInt();
        while (choose < 1 || choose > 3) {
            System.out.println("Mistake");
            System.out.println("Choose phone. Enter 1,2 or 3");
            choose = scanner.nextInt();
        }
        System.out.println("Enter the number of people to send the message to");
        int people = scanner.nextInt();
        int[] arr = new int[people];
        System.out.println("Enter the phone numbers to which the message will be sent");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();
        }

        switch (choose) {
            case 1:

                phone1.sendMessage(arr);
                break;
            case 2:

                phone2.sendMessage(arr);
                break;
            case 3:

                phone3.sendMessage(arr);
                break;
        }
    }

    private static void callWithNumber(Random r, Phone phone1, Phone phone2, Phone phone3) {
        int receive = r.nextInt(3);
        receive++;
        System.out.println("Call to your phone ¹" + receive);
        switch (receive) {
            case 1:
                phone1.receiveCall("Polina", 1234567);
                break;
            case 2:
                phone2.receiveCall("Alina", 7654321);
                break;
            case 3:
                phone3.receiveCall("Arina", 1112223);
                break;
        }
    }

    private static void call(Random r, Phone phone1, Phone phone2, Phone phone3) {
        int phone = r.nextInt(3);
        phone++;
        System.out.println("Call to your phone ¹" + phone);
        switch (phone) {
            case 1:
                phone1.receiveCall("Polina");
                break;
            case 2:
                phone2.receiveCall("Alina");
                break;
            case 3:
                phone3.receiveCall("Arina");
                break;
        }
    }
}
