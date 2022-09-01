package by.teachmeskills.novik.lesson10.classwork.lines;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String testString="This is our big String";
        //want to check 4 position
        System.out.println(testString.charAt(3)); //begin from 0. here 0 - T
        char[] myChars=new char[3];
        testString.getChars(6,9,myChars,0);
        System.out.println(Arrays.toString(myChars));
        //how many i
        char needed= 'i';
        int count=0;
        for (char element: testString.toCharArray()) {
            if (element==needed) {
                count++;
            }
        }
        System.out.println(count); //4 i
        //how to make a line
        String intToStr=4+"";
        String intToStr2=String.valueOf(4);
        //search in Line like in array
        int index=testString.indexOf("is");
        System.out.println(index + "- search");
        int lastIndex= testString.lastIndexOf("is");
        System.out.println(lastIndex); //last is starts from 5
        int indexx=testString.indexOf("ist");
        System.out.println(indexx + "- search"); //-1 - no ist here
        System.out.println(testString.startsWith("This")); //line starts from this word This
        System.out.println(testString.endsWith("This")); //true-ing and etc
        //change i for a
        testString=testString.replace('i','a').replace('a','u');//can do in a row
        System.out.println(testString);
        System.out.println("   i i          ".trim()); //delete spaces
        //big and little symbols
        System.out.println("JFJIjijojJJOIJOjjojo".toLowerCase());
        System.out.println("JFJIjijojJJOIJOjjojo".toUpperCase());
        //array fromsentence
        String messageString=" this is my house"; //better to use trim before
        String[] messageArray=messageString.split(" "); //" " - place to split
        System.out.println(Arrays.toString(messageArray));
        System.out.println(messageArray[0].isEmpty()); //check if 0 element is empty: true
        String isEmptyString="          ";
        System.out.println(isEmptyString.isEmpty() || isEmptyString==null);//it is not empty - false. if null true, we added this situation
        System.out.println(isEmptyString.isBlank());//it has only spaces - true. if null false
        //part of line as new line. String - substring
        int indexex=messageString.lastIndexOf("is");
        System.out.println(messageString.substring(indexex)); //take all line starting from last is
        int indexe=messageString.indexOf("is");
        System.out.println(messageString.substring(indexe)); //is is my house
        System.out.println(messageString.substring(indexe+2)); //" is my house"
                //we can search is in such way. Search - delete. main3

    }
}
