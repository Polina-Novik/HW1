package homework_lesson3;

public class Summation_3 {
    public static void main(String[] args) {
        System.out.println("������� ����� ������������� ����� �� 1 �� 100 ������������");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int i = 1;
        int j = 1;
        if (a > 100) {
            System.out.println("����� ������ ���, ���������� ��� ���");
        } else {
            if (a < 1) {
                System.out.println("����� ������ �������, ���������� ��� ���");
            } else
                while (j < a) {
                    j = j + 1;
                    i = i + j;

                }


        }
        System.out.println("����� ����� �� 1 �� " + a + ": " + i);
    }
}
