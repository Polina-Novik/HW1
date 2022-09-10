package by.teachmeskills.novik.lesson12.classwork.files;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        //File file=new File(".idea"); //mb showing way c:..."" here relative way
        File file=new File("C:\\Users\\Asus\\IdeaProjects\\a\\.idea"); //absolute pathway. copy from getAbsolutePath
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());//not a file
        System.out.println(file.isHidden());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        //file.delete();
    }
}
