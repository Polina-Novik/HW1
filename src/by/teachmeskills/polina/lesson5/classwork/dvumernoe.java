package by.teachmeskills.polina.lesson5.classwork;

public class dvumernoe {
    public static void main(String[] args) {
        int[][]arr=new int[4][]; //4 �������, ����� ������ �� �������
        arr[0]=new int[1];
        arr[1]=new int[2];
        arr[2]=new int[3];
        arr[3]=new int[4];
        //����� ��������� ���������� ������, �� ��� ��������!!!
        //Arrays.deepToString(arr); ����� sout
        for(int x=0;x<4;x++){
        for (int i=0;i<arr[x].length;i++) {
            System.out.print(i +" ");}
            System.out.println();}
    }
}
