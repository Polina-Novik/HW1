package by.teachmeskills.novik.lesson6.classwork;

public class TestClass {
    public static void main(String[] args) {
        Triangle t=new Triangle(); //������� ����������� t, ������ ����������� ������
       // System.out.println(t.a);
        //t.a=3; //������� �=3
       // t.b=5;
        //t.c=4; //���� � � ������� ������� ��� ��������,����� ���� �� ��� ������
        System.out.println(t.getPerimetr());
        System.out.println(t.getMultiplyPerimetr(3)); //����� ��������� ��������� ��������� ���������
        System.out.println(t.getA());
        System.out.println(t); //������������ � � �������, �� ����������� � ������� ������ toString
           Triangle t1 = new Triangle (3,4,5);
        System.out.println(t1);
    }
}
