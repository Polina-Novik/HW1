package by.teachmeskills.novik.lesson7.classwork;

public final class Laptop extends Computer{ //� ����� ����� ������ � ������
    //����� ��������� ������ ����� ������, ����� �� ����� �� ���� ������
    public Laptop (int batteryLife) {
        super("blablabla"); //�������� ����������� ������ �����, �������� ����� � ctrl B ������ �� ��������
        this.batteryLife=batteryLife;
    }
   /*final*/ int batteryLife; //������ 1 ��� ����� ��������� ��������. �� ���� ��� 3, ����� 5 �����
    public void setCost(int cost) {
        /*���� �� ��������� super.setCost(cost+5);*/ //��� � ����� ������ ����. ���� �� �����, ����� ����������� ����. ����� ������� ��� ���� ����� ��� ���� � ��
    this.cost=cost+5;
    }
  /*  public void test() { ���� �� ���������
        this.setCost(5);
        super.setCost(10);
    }*/
}
