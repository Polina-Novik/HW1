package by.teachmeskills.novik.lesson10.homework.first;

public class Number {
    public static String str;

    public Number(String str) {
        this.str = str;
    }
public static void Numbers(String str) {
    String[] arr = Number.str.split("-");
        System.out.println(arr[0] + " " + arr[2]);
        System.out.println(arr[0] + "-***-" + arr[2] + "-***-" + arr[4]);
    }
public static void Letters(String str) {
    String[] arr = Number.str.split("-");
    StringBuilder builder = new StringBuilder();
    builder.append(arr[4]);
    builder.deleteCharAt(0);
    builder.deleteCharAt(1);
    String xyxy = builder.toString();
    System.out.println(arr[1].toLowerCase() + "/" + arr[3].toLowerCase() + "/" + xyxy.toLowerCase());
    StringBuilder b = new StringBuilder();
    b.append(arr[1] + "/").append(arr[3] + "/").append(xyxy);
    String letters = b.toString();
    System.out.println("Letters:" + letters.toUpperCase());
}
public static void abc(String str) {
    System.out.println("Document number contains abc or ABC:" + Number.str.toLowerCase().contains("abc"));
}
public static void Five(String str) {
    String[] arr = Number.str.split("-");
    System.out.print("Document number starts from 5555: ");
    if (0 == "5555".compareTo(arr[0])) {
        System.out.println("true");
    } else System.out.println("false");
}
public static void get1a2b (String str) {
    String[] arr = Number.str.split("-");
    System.out.print("Document number ends with 1a2b: ");
    if (0 == "1a2b".compareTo(arr[4])) {
        System.out.println("true");
    } else System.out.println("false");
}
}
