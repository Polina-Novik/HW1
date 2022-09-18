package by.teachmeskills.novik.lesson14.classwork;

public class Main {
    public static void main(String[] args) {
        System.out.println(Month.JANUARY);
        for (Month month : Month.values()) {
            System.out.println(month);
        }
        Month month=Month.JANUARY;
        System.out.println(Month.JANUARY.ordinal()); //physical position
        printMonth(month);
        printMonth(Month.FEBRUARY);
    }

    private static void printMonth(Month month) {
        switch (month) {
            case JANUARY:
                System.out.println("It is "+Month.JANUARY.getNumber()+" month");
                break;
            case FEBRUARY:
                System.out.println("it is "+Month.FEBRUARY.getNumber()+ " month");
                break;
        }
    }
}
