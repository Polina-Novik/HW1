package by.teachmeskills.novik.lesson10.classwork.lines;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("test".compareTo("aest")); //bigger => 19, alf
        System.out.println("test".compareTo("sest")); //close
        System.out.println("test".compareTo("test")); //0 - the same
        System.out.println("test".compareTo("zest"));
        System.out.println("test".compareTo("test1")); //if words are the same, will sort by length
        //for sorting of lines. what's bigger

        String str="This is our string";               //if we searched OuR
        System.out.println(str.toLowerCase().contains("our".toLowerCase())); //true - contains. lower for Our

    }
}
