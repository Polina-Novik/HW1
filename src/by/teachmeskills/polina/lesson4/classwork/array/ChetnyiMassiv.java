package by.teachmeskills.polina.lesson4.classwork.array;

public class ChetnyiMassiv {
    public static void main(String[] args) {
        int [] arr=new int[6];

        for (int i = 0; i < arr.length; i++) { arr[i] = i*2;
            System.out.println("arr[" + i + "]=" + arr[i]);

        }
    }
}