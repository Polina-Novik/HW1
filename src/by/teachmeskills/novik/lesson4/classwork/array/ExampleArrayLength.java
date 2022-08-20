package by.teachmeskills.novik.lesson4.classwork.array;

public class ExampleArrayLength {
    public static void main(String[] args) {
        //массивы String[] args
        //int [] arr=new int[2]; 2 €чейки пам€ти подр€д, тут пустой массив,
        // можно добавить элемент в массив arr[2]=1;
        // заполненный:
        //new int[] {1,1}; второйслучай
        //int[] arr = {1,1};
        //int[] arr=new int[]{1,1}; здесь
        //arr[0] это 1, arr[1] 1; arr[2] ошибка, элемента всего два
        //if (Boolean.TRUE.equals........ короче не по курсу, че-то дл€ командной строки
        int[] arr = new int[]{1, 4};
        int x = arr[1];

        System.out.println(x);
        System.out.println(arr.length); //длина массива
        System.out.println(args.length); //дл€ Strings, там пустой массив, в мэйне
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
            arr[i] = i;
            //заполн€ем каждый элемент массива числом i
        }
    }
}