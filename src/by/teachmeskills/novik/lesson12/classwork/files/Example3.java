package by.teachmeskills.novik.lesson12.classwork.files;

import java.io.File;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        File file=new File(".idea");
        System.out.println(Arrays.toString(file.list())); //showing cathalog
        for (File currentFile: file.listFiles()) {  //second method
            System.out.println(currentFile.getName());
        }
        for (File currentFile: file.listFiles(new MyFileFilter())) {  //second method
            System.out.println("AAAAAAAAAA   "+ currentFile.getName());
        }
    }
}
