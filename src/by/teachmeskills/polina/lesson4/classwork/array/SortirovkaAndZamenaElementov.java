package by.teachmeskills.polina.lesson4.classwork.array;

import java.util.Arrays;

public class SortirovkaAndZamenaElementov {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = new int[3];
        arr[0] = 0;
        arr[1] = 2;
        arr[2] = 1;
        Arrays.sort(arr); //дл€ сортирвки по возрастанию, но оч т€желое!!!!!!!!!
        // нажать sort, ctrl +P; вызов херни, че-то корпоратор, способ задать свой по€рдок соритровки, овзраст убыв
        // вес им€
        //сортировка пузырьками говно
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            arr2[i] = arr[2 - i]; //чтобы задом наперед, можно и справа мен€ть, 2 это аррюленс-1
            //дальше запуталась
            System.out.println("arr2[" + (i) + "]=" + arr2[i]);
            //при вводе system.cop пподсказки
            //ctrl b опписание метода (объект, инт объект инт инт)
            //System.arraycopy();
        }
        System.arraycopy(arr, 1, arr2, 0, 1); //из первого массива из 1 во второй массив в 2 3 шт

        for (int i = 0; i < arr.length; i++) {

            System.out.println("arr2[" + (i) + "]=" + arr2[i]);}
            //или
        System.out.println("ƒл€ вывода чисто массива без номера €чеек");
            for (int element : arr2) {
                System.out.println(element);
            }
//но тут нельз€ удал€ть че=то из массива в element, эта коллекци€ должна быть неизмен€ема!
        //дл€ массивов сойдет, но в др коллекци€х плохо
    }

    public static void testMethod(int value) {
        //рекурси€ - вызываем в методе метод
        testMethod(value-1);
        //числа фибаначи: 0,1,1,2,3,5
        //кажде число - сумма других пред чисел
        //fib(5)=fib(4)+fib(3); т е n-1 и n-2,не подходит дл€ 0 и 1; дл€ деревьев исп рекурсию

    }
//что-то дл€ сортировки сли€ни€, нужно дл€ рекурсии
    //сортировка сли€ни€ дл€ сложени€ двух массивов, массивы не сорт
    /*  [1,2,3,4,5,6,7,8]
    [2,3,6,4,5,4,7,8] здесь сортировка левого и правого массива, потом еще пополам, и еще, и так до двухэл ов
    2 3 4 6 4 5 7 8
   потом сравн бочка и тд сложность nlogn гораздо быстрее пузырька
         еще быстра€ сортировка 6 2 3 4 5 4 7 8 подходитдл€ чисел в разброс, дл€ сложн случ говно
         перва€ 6, слева все что меньше ее справа что больш и тд
         */
    public static int fib(int position) {
        if (position == 0) {
            return 0;}
        if (position == 1) {
            return 1;}
        return fib (position-1) + fib(position -2);
        }
    }

