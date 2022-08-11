package by.teachmeskills.polina.lesson3.homework;

public class Bank_8 {
    public static void main(String[] args) {
        System.out.print("Введите сумму вклада: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double a = scanner.nextInt();
        System.out.print("Введите количество месяцев: ");
        java.util.Scanner console = new java.util.Scanner(System.in);
        int b = console.nextInt();
        for (int i = 0; i < b; i = i + 1) {
            a = a * 0.07 + a;
        }
        System.out.println("Конечная сумма вклада:" + a);
    }
}
