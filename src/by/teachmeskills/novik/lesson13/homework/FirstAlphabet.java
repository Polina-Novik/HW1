package by.teachmeskills.novik.lesson13.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FirstAlphabet {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        try (FileReader fileReader = new FileReader("text.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                text = text.toLowerCase();
                text = text.replace("“", "").replace(',', ' ').replace('”', ' ');
                words.addAll(Arrays.asList(text.split(" ")));
            }
            Collections.sort(words);
            deleteSpaces(words);
            System.out.println(words);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deleteSpaces(List<String> arrayList) {
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.isEmpty()) {
                iterator.remove();
            }
        }
    }
}
