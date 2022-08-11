package by.teachmeskills.polina.lesson4.classwork.array;

import java.util.Arrays;

public class SortirovkaAndZamenaElementov {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 1;
        Arrays.sort(arr); //��� ��������� �� �����������, �� �� �������!!!!!!!!!
        // ������ sort, ctrl +P; ����� �����, ��-�� ����������, ������ ������ ���� ������� ����������, ������� ����
        // ��� ���
        //���������� ���������� �����
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            arr2[i] = arr[2 - i]; //����� ����� �������, ����� � ������ ������, 2 ��� ��������-1
            //������ ����������
            System.out.println("arr2[" + (i) + "]=" + arr2[i]);
            //��� ����� system.cop ����������
            //ctrl b ��������� ������ (������, ��� ������ ��� ���)
            //System.arraycopy();
        }
        System.arraycopy(arr, 1, arr2, 0, 1); //�� ������� ������� �� 1 �� ������ ������ � 2 3 ��

        for (int i = 0; i < arr.length; i++) {

            System.out.println("arr2[" + (i) + "]=" + arr2[i]);}
            //���
        System.out.println("��� ������ ����� ������� ��� ������ �����");
            for (int element : arr2) {
                System.out.println(element);
            }
//�� ��� ������ ������� ��=�� �� ������� � element, ��� ��������� ������ ���� �����������!
        //��� �������� ������, �� � �� ���������� �����
    }

    public static void testMethod(int value) {
        //�������� - �������� � ������ �����
        testMethod(value-1);
        //����� ��������: 0,1,1,2,3,5
        //����� ����� - ����� ������ ���� �����
        //fib(5)=fib(4)+fib(3); � � n-1 � n-2,�� �������� ��� 0 � 1; ��� �������� ��� ��������

    }
//���-�� ��� ���������� �������, ����� ��� ��������
    //���������� ������� ��� �������� ���� ��������, ������� �� ����
    /*  [1,2,3,4,5,6,7,8]
    [2,3,6,4,5,4,7,8] ����� ���������� ������ � ������� �������, ����� ��� �������, � ���, � ��� �� ������ ��
    2 3 4 6 4 5 7 8
   ����� ����� ����� � �� ��������� nlogn ������� ������� ��������
         ��� ������� ���������� 6 2 3 4 5 4 7 8 ����������� ����� � �������, ��� ����� ���� �����
         ������ 6, ����� ��� ��� ������ �� ������ ��� ����� � ��
         */
    public static int fib(int position) {
        if (position == 0) {
            return 0;}
        if (position == 1) {
            return 1;}
        return fib (position-1) + fib(position -2);
        }
    }

