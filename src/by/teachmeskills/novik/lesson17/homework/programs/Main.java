package by.teachmeskills.novik.lesson17.homework.programs;




import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson17/homework/files/*/
        /*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson17/homework/emptyPackage/*/
        /*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson17/homework/wrongPackage/*/
        Map<String, Document> documentMap = new HashMap<>();
        String str = getPackageName();
        File folder = new File(str);
        File[] contents = folder.listFiles();
        emptyPackage(contents);
        for (File file : folder.listFiles()) {
            String filename = getFileName(file);
            Matcher matcher;
            String phoneNumber = "";
            String email = "";
            List<String> documentList = new ArrayList<>();
            Pattern patternEmail = Pattern.compile("^(.+)@(\\S+)$");
            try (FileReader fileReader = new FileReader(file)) {
                Scanner console = new Scanner(fileReader);
                while (console.hasNextLine()) {
                    String line = console.nextLine();
                    if (line.length() == 22 && line.contains("-")) {
                        documentList.add(line);
                    } else if (line.length() == 12 && line.contains("+(")) {
                        phoneNumber = line;
                    } else {

                        matcher = patternEmail.matcher(line);
                        if (matcher.find()) {
                            email = line;
                        }
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Document document = new Document(documentList, phoneNumber, email);
            documentMap.put(filename, document);
        }

        System.out.println(documentMap);
    }

    private static String getFileName(File file) {
        String name = file.getName();
        checkFormat(name);
        Pattern pattern = Pattern.compile(".txt$");
        Matcher matcher = pattern.matcher(name);
        String filename = "";
        if (matcher.find()) {
            filename = matcher.replaceAll("");
        }
        matcher.reset();
        return filename;
    }

    private static String getPackageName() {
        System.out.println("Enter the package name");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    private static void checkFormat(String name) {
        try {
            getWrongFormat(name);
        } catch (WrongFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void emptyPackage(File[] contents) {
        try {
            getEmpty(contents);
        } catch (EmptyPackageException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static class Document {
        private List<String> documents;
        Optional<String> phoneNumber;
        Optional<String> email;

        public Document(List<String> documents, String phoneNumber, String email) {
            this.documents = documents;
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            this.email = Optional.ofNullable(email);
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
        if (contents.length == 0) throw new EmptyPackageException();
        return (contents.length == 0);
    }

    private static boolean getWrongFormat(String str) throws WrongFormatException {
        if (!str.toLowerCase().contains(".txt")) throw new WrongFormatException();
        return (!str.toLowerCase().contains(".txt"));
    }
}

