package by.teachmeskills.novik.lesson10.classwork.lines;

public class Main5 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("MyString: "); //or StringBuilder builder = new StringBuilder();
       //to add to line
        builder.append("this").append(" is ").append("my" + "house");//or builder.append("this");

        System.out.println(builder.toString());
        builder.insert(10,"ooph "); //position 10, word ooph
        // builder.deleteCharAt(8); //delete 8 symbol
        builder.delete(0,8);
       /* if (true) {
            builder.append(3);
        } */
        String result = builder.toString();
        System.out.println(result);//the same
       // System.out.println(builder.reverse().toString()); to reverse

    }
}
