package by.teachmeskills.novik.lesson11.homework.second;

import java.util.Scanner;

import static by.teachmeskills.novik.lesson11.homework.second.LoginPassword.Enter;

public class Test {
    public static void main(String[] args) {
        System.out.println("Please enter login:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Confirm the password:");
        String confirmPassword = scanner.nextLine();
        Enter(login, password, confirmPassword);
    }
}
