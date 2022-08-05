package homework_lesson3;
public class Temperature_1 {public static void main(String[] args) {
        System.out.println("Введите температуру на улице в градусах по Цельсию");
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int a=scanner.nextInt();
        if (a>-5) {
        System.out.println("Тепло");
    }
    else {if (a>-20) {
        System.out.println("Нормально"); }
        else
        System.out.println("Холодно");
    }
    }
    }

