package by.teachmeskills.novik.lesson12.classwork.files;

import java.io.File;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        File file=new File("sample2.txt"); //or C:\\home\\myfile.txt
        file.mkdir(); //create a papka
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        File f=new File("sample2.txt");
        try {
            f.createNewFile(); //create new file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println("my str\ting"); //using tabulation. and \n. thats why  \\
        System.out.println("my str\\ing");
    }
}
