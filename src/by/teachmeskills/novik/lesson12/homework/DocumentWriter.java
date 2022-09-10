package by.teachmeskills.novik.lesson12.homework;

import java.io.FileWriter;
import java.io.IOException;

public class DocumentWriter {
    public static void main(String[] args) {
        try {
            FileWriter documentNumber = new FileWriter("file.txt", true); //new lines!!!
            documentNumber.write("docnum123456789\n");
            documentNumber.write("docnumdgfhumnvu\n");
            documentNumber.write("docnumsdghjhkiljhgtreswrtjhg\n");
            documentNumber.write("docnum1d2f3g4h5j\n");
            documentNumber.write("docnum34gv6j8d4\n");
            documentNumber.write("1234567890qwert\n");
            documentNumber.write("docnum23456789009876543\n");
            documentNumber.write("docnumvbn67f99o\n");
            documentNumber.write("contracthj7kfj7\n");
            documentNumber.write("contract567490k\n");
            documentNumber.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
