package by.teachmeskills.novik.lesson7.homework.Register;

import javax.print.Doc;
import java.util.Date;

public abstract class Document implements Printable {

    int DocumentNumber;
    String DocumentDate;
    public Document(int DocumentNumber,String DocumentDate) {
        this.DocumentNumber=DocumentNumber;
        this.DocumentDate=DocumentDate;
    }

    public int getDocumentNumber() {
        return DocumentNumber;
    }

    public void setDocumentNumber(int number) {
        this.DocumentNumber=number;
    }

    public String getDocumentDate() {
        return DocumentDate;
    }

    public void setDocumentDate(String DocumentDate) {
        this.DocumentDate = DocumentDate;
    }
}
