import java.util.Random;

public class OrSeasons {
    public static void main(String[] args) {
        Random r = new Random();
        int randomValue = r.nextInt(12);
        int a = ++randomValue;
        System.out.println(a);
        switch (a) {
            case 1, 2, 12:
                System.out.println("����");
                break;   //�������� ��������

            case 3, 4, 5:
                System.out.println("�����");
                break;

            case 6, 7, 8:
                System.out.println("����");
                break;
            case 9, 10, 11:
                System.out.println("�����");
                break;
        }
    }
}
