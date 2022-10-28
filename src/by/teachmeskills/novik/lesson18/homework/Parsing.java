package by.teachmeskills.novik.lesson18.homework;

import by.teachmeskills.novik.lesson17.homework.programs.EmptyPackageException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson17/homework/emptyPackage/*/
/*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson18/homework/xml/*/
/*C:/Users/Asus/IdeaProjects/a/src/by/teachmeskills/novik/lesson18/homework/manyXml/*/
public class Parsing {
    private static List<Sonnet> sonnets = new ArrayList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Scanner scanner = new Scanner(System.in);
        File file = getFile(scanner);
        System.out.println("Choose way of parsing\n1.SAX\n2.DOM");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                useSAX(file);
                break;
            case 2:

                try {
                    File inputFile = new File(file.toURI());
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(inputFile);
                    doc.getDocumentElement().normalize();
                    try {
                        useDOM(doc);

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    private static void useDOM(Document doc) throws IOException {
        String fileName = null;
        NodeList list = doc.getElementsByTagName("author");
        fileName = getString(doc, fileName, list);
        FileWriter fileWriter = new FileWriter(fileName + ".txt", true);
        fileWriter.write(doc.getDocumentElement().getNodeName() + "\n");
        NodeList nList = doc.getElementsByTagName("author");
        getAuthorInformation(fileWriter, nList);
        fileWriter.write(doc.getElementsByTagName("title").item(0).getTextContent() + "\n");
        NodeList lList = doc.getElementsByTagName("line");
        for (int i = 0; i < lList.getLength(); i++) {
            fileWriter.write(lList.item(i).getTextContent() + "\n");
        }
        fileWriter.close();
    }

    private static void getAuthorInformation(FileWriter fileWriter, NodeList nList) throws IOException {
        for (int i = 0; i < nList.getLength(); i++) {
            Node current = nList.item(i);
            fileWriter.write(current.getNodeName() + "\n");
            Element element = (Element) current;
            fileWriter.write(element.getElementsByTagName("lastName").item(0).getTextContent() + "\n");
            fileWriter.write(element.getElementsByTagName("firstName").item(0).getTextContent() + "\n");
            fileWriter.write(element.getElementsByTagName("nationality").item(0).getTextContent() + "\n");
            fileWriter.write(element.getElementsByTagName("yearOfBirth").item(0).getTextContent() + "\n");
            fileWriter.write(element.getElementsByTagName("yearOfDeath").item(0).getTextContent() + "\n");
        }
    }

    private static String getString(Document doc, String fileName, NodeList list) {
        for (int i = 0; i < list.getLength(); i++) {
            Node current = list.item(i);
            Element element = (Element) current;
            String lastName = element.getElementsByTagName("lastName").item(0).getTextContent();
            String firstName = element.getElementsByTagName("firstName").item(0).getTextContent();
            fileName = firstName + "_" + lastName + "_" + doc.getElementsByTagName("title").item(0).getTextContent();
        }
        return fileName;
    }

    private static void useSAX(File file) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        AdvancedXMLHandler handler = new AdvancedXMLHandler();
        parser.parse(new File(file.toURI()), handler);
        try {

            FileWriter fileWriter = new FileWriter("SAXSonnet.txt", true);
            for (Sonnet sonnet : sonnets)
                fileWriter.write(String.format(sonnet.getLine()) + "\n");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static File getFile(Scanner scanner) {
        System.out.println("Enter the package name");
        String str = scanner.nextLine();
        File folder = new File(str);
        File[] contents = folder.listFiles();
        File file = folder.listFiles()[0];
        checkIfItIsEmpty(contents);
        try {
            isLongerThenOne(contents);
        } catch (NotOneXmlException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static void checkIfItIsEmpty(File[] contents) {
        try {
            isEmpty(contents);
        } catch (EmptyPackageException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static boolean isEmpty(File[] contents) throws EmptyPackageException {
        if (contents.length == 0) throw new EmptyPackageException();
        return (contents.length == 0);
    }

    private static boolean isLongerThenOne(File[] file) throws NotOneXmlException {
        if (file.length > 1) throw new NotOneXmlException();
        return (file.length > 1);
    }

    private static class AdvancedXMLHandler extends DefaultHandler {
        private String line, lastElementName;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElementName.equals("line"))
                    line = information;

            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ((line != null && !line.isEmpty())) {
                sonnets.add(new Sonnet(line));
                line = null;

            }
        }
    }
}
