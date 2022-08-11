package by.teachmeskills.polina.lesson3.homework;

public class Rainbow_2 {
    public static void main(String[] args) {
        System.out.println("Введите номер цвета в радуге, от 1 до 7");
        java.util.Scanner scanner= new java.util.Scanner(System.in);
        int a=scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
                break;
            case 7:
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("Mistake");
                break;

        }
    }
}
