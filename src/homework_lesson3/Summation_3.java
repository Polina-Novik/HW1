package homework_lesson3;

public class Summation_3 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число от 1 до 100 включительно");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        int j = 1;
        if (a > 100) {
            System.out.println("Число больше ста, попробуйте еще раз");
        } else {
            if (a < 1) {
                System.out.println("Число меньше единицы, попробуйте еще раз");
            } else
                while (j < a) {
                    j = j + 1;
                    i = i + j;

                }


        }
        System.out.println("Сумма чисел от 1 до " + a + ": " + i);
    }
}
