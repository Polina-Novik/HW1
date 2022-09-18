package by.teachmeskills.novik.lesson12.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DocumentBetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write file name. For example file.txt");
        String fileName = scanner.nextLine();
        try {
            FileWriter validDocuments = new FileWriter("valid.txt", true);
            validDocuments.write("valid documents report file\n");
            FileWriter invalidDocuments = new FileWriter("invalid.txt", true);
            invalidDocuments.write("invalid documents report file\n");
            filterDocuments(fileName, validDocuments, invalidDocuments);
            validDocuments.close();
            invalidDocuments.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        printInvalidDocuments();

        printValidDocuments();
    }

    private static void printValidDocuments() {
        Scanner scanner;
        try (FileReader validReader = new FileReader("valid.txt")) {
            scanner = new Scanner(validReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void printInvalidDocuments() {
        Scanner scanner;
        try (FileReader invalidReader = new FileReader("invalid.txt")) {
            scanner = new Scanner(invalidReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void filterDocuments(String fileName, FileWriter validDocuments, FileWriter invalidDocuments) {
        Scanner scanner;
        try (FileReader fileReader = new FileReader(fileName)) {
            scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String currentDocument = scanner.nextLine();
                if (currentDocument.length() != 15) {
                    invalidDocuments.write("Number of characters is not 15\n");
                    invalidDocuments.write(currentDocument + "\n");
                } else if (!currentDocument.startsWith("docnum") && !currentDocument.startsWith("contract")) {
                    invalidDocuments.write("Document number doesn't start with docnum or contract\n");
                    invalidDocuments.write(currentDocument + "\n");
                } else {
                    validDocuments.write(currentDocument + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
