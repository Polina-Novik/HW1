package by.teachmeskills.novik.lesson7.classwork;

public interface Flyable {
    //void fly();//����� ���������, ����� �� �������, ����� ���� � �� ����� ���� ���
    final int myNumber = 0; //������ ����� ������ ��� ��� �� ����� ���
    default void fly() {
        System.out.println(getString() + "I can fly!!!!!!!!!!!!");
    }
    private String getString() { //����� ������ ��������� ������� � ���������
        return "AAAHHHHHHHH ";
    }
}
/*������� �� ���� ������: ��� �����������
* ���� ������ ������, �� ����������
* ��������� ������ ������
* ����������� 3 ���������: ������ ��-�, ���� ������ �����
* �������������� @FunctionalInteface ������ 1 �����: � ��� ��� ������, �� ���� ��� �������
* ������ - ������ �-�, �� ������ �������� ������ � �� � ��������, �� �����*/