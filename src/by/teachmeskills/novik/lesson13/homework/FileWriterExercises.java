package by.teachmeskills.novik.lesson13.homework;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExercises {
    public static void main(String[] args) {
        try {
            FileWriter first = new FileWriter("text.txt", true);
            first.write("Once upon a time, a princess named Snow White lived in a castle with her father, the King, and her stepmother, the Queen. Her father had always said to his daughter that she must be fair to everyone at court. Said he: “People come here to the castle when they have a problem. They need the ruler to make a fair decision. Nothing is more important than to be fair.The Queen, Snow White’s stepmother, knew how much this meant to her husband. At the first chance, she rushed to her magic mirror.  “Mirror, mirror, on the wall,” said the Queen.  “Who is the fairest of them all?”");
            first.close();
            FileWriter second = new FileWriter("numbers.txt", true);
            second.write("1 2 3 3 3 4 9 7 5 6 4 33 33 7890 12345678");
            second.close();
            FileWriter fourth = new FileWriter("Strings.txt", true);
            fourth.write("Hello\n");
            fourth.write("my\n");
            fourth.write("name is\n");
            fourth.write("POLINA");
            fourth.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
