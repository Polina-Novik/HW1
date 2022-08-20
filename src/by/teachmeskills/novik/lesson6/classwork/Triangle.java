package by.teachmeskills.novik.lesson6.classwork;

//������ ������� ���������� ����� ������������ ����� ������
public class Triangle {


    private double a; //������� ����� ��������� public or private or protected, private - ������������ ��� ���-�� ������ ��� ����
    private double b; //���� ������ �������� �� ������


    private double c;
    int coefficient;

    public void setA(double a) {
        if (a < 0) { //���� ������� �� ���� ������ 0
            this.a = 0;
        } else
            this.a = a;
    }

    public double getA() {
        if (a < 0) {
            return 0;
        }
        return a;
    } //������ ����� ���������� ��� ����������. ���� �� ����� ����� ������ 0

    public Triangle() {//��� ���� �����������, ����� ������ ������ �������� ��� �������� � � ��
        this.a = 3; //this ������������� ��� ���������� ����� ������, ��� � ��� ���� ����, � ����� ��� �� ������, ���� � ���� ������, �� ������
        this.b = 4;
        this.c = 5;
    }

    public Triangle(double a, double b, double c) { //�� ����� ��� �������� ������, �� ����� ������ ���� ����,� ��� �� �������
        this.a = a; //����������� � � �
        this.b = b;
        this.c = c; //���� ������ ������������ ������ ����������� �����������
        this.incrementA(); //�� �� � � c ���� ������ ��� ������� �� 1, � ��� ����� ���� ���� �����
    }

    public double getPerimetr() {
        return this.a + this.b + this.c; //���� ��������� �� ��������
    }
//�� ��������� ������� context ��� ������� ��������

    /**
     * ���������
     *
     * @param coefficient
     * @return ���������
     */
    public double getMultiplyPerimetr(int coefficient) {
        this.coefficient = coefficient; //��� �������������? ������ 7 ���������� ��������
        //���� ������ ������� ����� cash ������ ��������� ����
        return this.getPerimetr() * coefficient;

    }

    @Override
    public String toString() { //�� �� ������ ��� � ���� �� ������� ������� ��� � ������� � ������
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", coefficient=" + coefficient +
                '}';
    }

    private void incrementA() {
        this.a++;
        this.c++;
    }
}

