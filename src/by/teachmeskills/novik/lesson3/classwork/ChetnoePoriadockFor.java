package by.teachmeskills.novik.lesson3.classwork;

public class ChetnoePoriadockFor {
    public static void main(String[] args) {
        //for(int i=0 или 1 типа нач знач; условие? i<10 INT>0 при этом идет и невыполнвыход; ччо хотим i++
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        for (int i = 10; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }}