package homework_lesson3;

import java.util.Random;

public class RandomTemperature_1 {public static void main(String[] args) {
    Random r = new Random();
    int a = -30 + r.nextInt(61);
    System.out.println("�������� ����������� �� �����: " + a);
    if (a>-5) {
        System.out.println("�����");
    }
    else {if (a>-20) {
        System.out.println("���������"); }
    else
        System.out.println("�������");
    }
}
}

