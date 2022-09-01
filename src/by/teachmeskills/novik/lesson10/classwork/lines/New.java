package by.teachmeskills.novik.lesson10.classwork.lines;

public class New {
    public static void main(String[] args) {
        String str="a";
        String str2="a";
        System.out.println(str == str2); //true
        String str3=new String("a");
        System.out.println(str==str3); //false
        System.out.println(str.equals(str3)); //true again... equals compares by content not text
        System.out.println(str.length());

        String nextStr=str+str2;
        System.out.println(nextStr);
        String nextStr2=str.concat(str2);
        System.out.println(nextStr2);
        String nextStr3 = String.join("*",str,str2,str3);
        System.out.println(nextStr3);

        //line with number
        int nextInt=5;
        String mixedString=nextInt+str;
        String mixedString2=str+nextInt;
        System.out.println(mixedString);
        System.out.println(mixedString2);
        String mixedString3=(nextInt+nextInt)+str;
        System.out.println(mixedString3); //10!!!
    }
}
