package by.teachmeskills.novik.lesson7.classwork;

public class TestComp {
    public static void main(String[] args) {
        Computer c=new PK(); //вместо комп было пк
        //c.setCost(10);

        Computer l=new Laptop(5);
        //l.setCost(10);
         //сеттер войд, нельзя печатать
        Computer[] arr = new Computer[2];
       arr[0]=c;
       arr[1]=l;
       for (Computer el : arr) {
           el.setCost(10);
       } System.out.println(c.getCost());
        System.out.println(l.getCost());
        Flyable[] arr2=new Flyable[3];
        arr2[0]=new Airplane();
        arr2[1]=new Ball();
        arr2[2]=new Bird(); //птицу не прописали они дефолтная
        for(Flyable fl : arr2) {
            fl.fly();
        }


    }
}
