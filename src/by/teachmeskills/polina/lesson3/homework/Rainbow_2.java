package by.teachmeskills.polina.lesson3.homework;

public class Rainbow_2 {
    public static void main(String[] args) {
        System.out.println("������� ����� ����� � ������, �� 1 �� 7");
        java.util.Scanner scanner= new java.util.Scanner(System.in);
        int a=scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("�������");
                break;
            case 2:
                System.out.println("���������");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("�������");
                break;
            case 5:
                System.out.println("�������");
                break;
            case 6:
                System.out.println("�����");
                break;
            case 7:
                System.out.println("����������");
                break;
            default:
                System.out.println("Mistake");
                break;

        }
    }
}
