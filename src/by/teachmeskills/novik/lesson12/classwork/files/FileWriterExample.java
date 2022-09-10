package by.teachmeskills.novik.lesson12.classwork.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
           // FileWriter fileWriter = new FileWriter("sample2.txt"); //without try catch throw mistake//we run program and no new lines
            FileWriter fileWriter = new FileWriter("sample2.txt",true); //new lines!!!
            fileWriter.write("This is first line\n");
            fileWriter.write("This is second line\n");
            fileWriter.close(); //!!!
           // fileWriter.flush(); extreme saving. saves all before, even before mistake
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
