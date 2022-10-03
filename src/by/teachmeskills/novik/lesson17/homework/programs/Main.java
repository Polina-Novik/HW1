package by.teachmeskills.novik.lesson17.homework.programs;


import by.teachmeskills.novik.lesson11.homework.first.NotAbcException;
import by.teachmeskills.novik.lesson11.homework.first.Number;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Map<String, Document> documentMap = new HashMap<>();
        System.out.println("Enter the package name");
        /*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson17/homework/files/*/
        /*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson17/homework/emptyPackage/*/
        /*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson17/homework/wrongPackage/*/
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        File folder = new File(str);
        File[] contents=folder.listFiles();
        try {getEmpty(contents);
        } catch (EmptyPackageException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        for (File file : folder.listFiles()) {
            String name = file.getName();
            try {getWrongFormat(name);
            } catch (WrongFormatException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            Pattern pattern = Pattern.compile(".txt$");
            Matcher matcher = pattern.matcher(name);
            String filename = "";
            String phoneNumber = "";
            String email = "";
            if (matcher.find()) {
                filename = matcher.replaceAll("");
            }
            matcher.reset();
            List<String> arrayList = new ArrayList<>();
            Pattern pattern1 = Pattern.compile("^(.+)@(\\S+)$");
            try (FileReader fileReader = new FileReader(file)) {
                Scanner console = new Scanner(fileReader);
                while (console.hasNextLine()) {
                    String s = console.nextLine();
                    if (s.length() == 22 && s.contains("-")) {
                        arrayList.add(s);
                    } else if (s.length() == 12 && s.contains("+(")) {
                        phoneNumber = s;
                    } else {

                        matcher = pattern1.matcher(s);
                        if (matcher.find()) {
                            email = s;
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Document document = new Document(arrayList, phoneNumber, email);
            documentMap.put(filename, document);
        }

        System.out.println(documentMap);
    }
    private static class Document {
        private List<String> documents;
        private String phoneNumber;
        private String email;

        public Document(List<String> documents, String phoneNumber, String email) {
            this.documents = documents;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }


        @Override
        public String toString() {
            return "Document{" +
                    "documents=" + documents +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
    private static boolean getEmpty(File[] contents) throws EmptyPackageException {
        if (contents.length==0) throw new EmptyPackageException();
        return (contents.length==0);
    }
    private static boolean getWrongFormat(String str) throws WrongFormatException {
        if (!str.toLowerCase().contains(".txt")) throw new WrongFormatException();
        return (!str.toLowerCase().contains(".txt"));
    }
}

