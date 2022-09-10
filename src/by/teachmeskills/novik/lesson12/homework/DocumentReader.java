package by.teachmeskills.novik.lesson12.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocumentReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write file name. For example file.txt");
        String fileName = scanner.nextLine();
        try (FileReader fileReader = new FileReader(fileName)) {
            scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String a = scanner.nextLine();
                System.out.println(a);
                FileFilter(a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void FileFilter(String a) {
        if (a.length() == 15 && (a.startsWith("docnum") || a.startsWith("contract"))) {
            System.out.println("valid document number");
        } else System.out.println("invalid document number");
    }
}
