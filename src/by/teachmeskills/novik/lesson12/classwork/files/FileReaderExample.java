package by.teachmeskills.novik.lesson12.classwork.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("sample2.txt")) { //in the beginning more actions try sorrounding, than catch
            Scanner scanner=new Scanner(fileReader);
            while (scanner.hasNextLine()) { //or (scanner.hasNext()) or with int
                System.out.println(scanner.nextLine());//here too or (scanner.nextInt()+1)
            }
        } /*catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } */catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
