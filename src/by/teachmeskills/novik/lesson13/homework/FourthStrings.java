package by.teachmeskills.novik.lesson13.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FourthStrings {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

            try (FileWriter fileWriter = new FileWriter("reverse.txt", true);
                 FileReader fileReader = new FileReader("Strings.txt")) {
                Scanner scanner = new Scanner(fileReader);
                while (scanner.hasNextLine()) {
                    arrayList.add(scanner.nextLine());
                }
                System.out.println(arrayList);
                Collections.reverse(arrayList);
                for (String s : arrayList) {
                    fileWriter.write(s + "\n");
                }
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        try (FileReader secondReader = new FileReader("reverse.txt")) {
            Scanner scanner = new Scanner(secondReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
