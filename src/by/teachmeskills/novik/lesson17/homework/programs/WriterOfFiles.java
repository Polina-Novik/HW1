package by.teachmeskills.novik.lesson17.homework.programs;

import java.io.IOException;

public class WriterOfFiles {
    public static void main(String[] args) {
        try {

            java.io.FileWriter fileWriter1 = new java.io.FileWriter("my_file1.txt",true);
            fileWriter1.write("1234-abc-5678-fgh-1w2e\n");
            fileWriter1.write("2234-abc-5678-fff-1w2e\n");
            fileWriter1.write("+(44)1234567\n");
            fileWriter1.write("ababa@mail.ru\n");
            fileWriter1.close();
            java.io.FileWriter fileWriter2 = new java.io.FileWriter("my_file6.txt",true);
            fileWriter2.write("4234-abc-4444-fgh-3w4e\n");
            fileWriter2.write("+(29)3452786\n");
            fileWriter2.write("polina@gmail.com\n");
            fileWriter2.close();
            java.io.FileWriter fileWriter3 = new java.io.FileWriter("my_file3.txt",true);
            fileWriter3.write("7645-hgj-0000-dfg-3w4e\n");
            fileWriter3.write("+(33)3425687\n");
            fileWriter3.close();
            java.io.FileWriter fileWriter4 = new java.io.FileWriter("my_file4.txt",true);
            fileWriter4.write("0000-hhh-1111-bbb-5w7e\n");
            fileWriter4.write("6789-jiu-5674-hhh-5l6k");
            fileWriter4.write("novik@tut.by\n");
            fileWriter4.close();
            java.io.FileWriter fileWriter5 = new java.io.FileWriter("my_file5.txt",true);
            fileWriter5.write("+(10)97866543\n");
            fileWriter5.write("aaaaa@mail.ru\n");
            fileWriter5.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
