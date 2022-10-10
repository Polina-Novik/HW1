package by.teachmeskills.novik.lesson18.classwork.three;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement //question the main element
public class Question {
    private int id;
    private String questionname;
    private List<String> list;



    public int getId() {
        return id;
    }

    public List<String> getList() {
        return list;
    }
    //marshal put in xml, unmarshal output and read
}
