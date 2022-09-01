package by.teachmeskills.novik.lesson10.classwork.lines;

public class Main3 {
    public static void main(String[] args) {
        String testString="This is my example";
        String match = "is";
        int count=0;
        int index=testString.indexOf(match);
        while (index!=-1) {
            count++;
            testString=testString.substring(index+match.length());
            index=testString.indexOf(match);
        }
        System.out.println(count);

       /* int nextCount=getCount("my next string", "ne");
        System.out.println(nextCount);
        System.out.println("TEST".equals("test")); something........*/

    }
}
