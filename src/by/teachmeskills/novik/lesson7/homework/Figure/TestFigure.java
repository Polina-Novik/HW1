package by.teachmeskills.novik.lesson7.homework.Figure;


import java.util.Random;
import java.util.Scanner;

public class TestFigure {
    public static void main(String[] args) {
        System.out.println("Choose a figure five times");
        System.out.println("1.Triangle \n2.Rectangle\n3.Circle");
        Scanner scanner=new Scanner(System.in);
        Random r=new Random();
        int choose=scanner.nextInt();
        Figure[] arr=new Figure[5];
        int i=0;  int j=0;  double sum=0;
        while (j<5) {
            switch (choose) {
                case 1:
                    int a=r.nextInt(100);
              int b=r.nextInt(100);
              int c=r.nextInt(100);
              arr[i]=new Triangle(a,b,c);
                    System.out.println("Triangle with sides " +a+", "+b+", "+c);
                    j++;
              break;
                case 2:

                    int d=r.nextInt(100);
                    int e=r.nextInt(100);
                    arr[i]=new Rectangle(d,e);
                    System.out.println("Rectangle with sides " +d+", "+e);
                    j++;
                    break;
                case 3:

                    int radius=r.nextInt(100);
                    arr[i]=new Circle(radius);
                    System.out.println("Triangle with radius  " +radius);
                    j++;
                    break;
                default:
                    System.out.println("Mistake");
            }
if (choose==1 || choose==2 || choose==3 ) {
            System.out.println("Figure " + j + " perimeter: " + arr[i].getPerimeter() + ", area: " +arr[i].getPloshad());
            sum+=arr[i].getPerimeter();i++;}
   if (j<=4)        { choose=scanner.nextInt();}
        }
        System.out.println("The sum of the perimeters of the figures:" + sum);
    }
}
