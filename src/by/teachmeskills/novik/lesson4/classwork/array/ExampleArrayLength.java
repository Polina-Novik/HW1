package by.teachmeskills.novik.lesson4.classwork.array;

public class ExampleArrayLength {
    public static void main(String[] args) {
        //������� String[] args
        //int [] arr=new int[2]; 2 ������ ������ ������, ��� ������ ������,
        // ����� �������� ������� � ������ arr[2]=1;
        // �����������:
        //new int[] {1,1}; ������������
        //int[] arr = {1,1};
        //int[] arr=new int[]{1,1}; �����
        //arr[0] ��� 1, arr[1] 1; arr[2] ������, �������� ����� ���
        //if (Boolean.TRUE.equals........ ������ �� �� �����, ��-�� ��� ��������� ������
        int[] arr = new int[]{1, 4};
        int x = arr[1];

        System.out.println(x);
        System.out.println(arr.length); //����� �������
        System.out.println(args.length); //��� Strings, ��� ������ ������, � �����
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
            arr[i] = i;
            //��������� ������ ������� ������� ������ i
        }
    }
}