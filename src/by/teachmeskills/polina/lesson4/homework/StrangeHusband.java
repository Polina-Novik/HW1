package by.teachmeskills.polina.lesson4.homework;

public class StrangeHusband {
    public static void main(String[] args) {
        float path=1;
        float km=1,a=1;
        for (float N=2;N<=100;N++) {a=a*(-1);
            path=path+1/N;
            km=km + 1/N*a;
        }
        System.out.println("Distance from home: " + km);
        System.out.println("Common path:"+ path);
    }
}
