package by.teachmeskills.novik.lesson7.classwork;

public abstract class Computer { //�������� ���� �� ������� ����, ���� ����� ����������
    protected int cost; //����� ������ ���� ����������� � � ���� ������
    String model;
    int screenSize;
public Computer(String model) { //����� � �������  ���� ����������� ������
    this.model=model;
}
    public int getCost() {
        return cost;
    }

    public abstract void setCost(int cost);//������� ������� ����� ����, ��� ���� �� �����. ���������� �����������, ����
    //���� ������ ������. �� �� ������................................

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    //� ��� ���� ������ ����� ��������, � ������ �������, � ������ ����� ������������ �������� � �������
}
