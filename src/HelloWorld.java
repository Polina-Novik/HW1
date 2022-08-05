import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //про рандомные числа, тут двое, 2 в конце чтоб две посл цифры не изм
        Random r = new Random();
                       int randomValue = r.nextInt(2);
        System.out.println(randomValue);
        randomValue = r.nextInt(2);
        System.out.println(randomValue);

    }
}
