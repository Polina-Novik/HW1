package by.teachmeskills.novik.lesson12.classwork.files;

public class HW {
    public static void main(String[] args) {
        System.out.println(calculateCharacters("abcde"));
        String[] elements="ejrlrj fffff 12345 jkl".split(" ");
        String minValue=elements[0];
        for (String element:elements) {
            if (calculateCharacters(minValue)>calculateCharacters(element)) {
                minValue=element;
            }
        }
        System.out.println(minValue);
    }
    private static int calculateCharacters (String string) {
        String existentCharacters="";
        for(char element:string.toCharArray()) {
            if (!existentCharacters.contains(element+"")) {
                existentCharacters+=element;
            }
        }
        return existentCharacters.length(); //count repeating symbols
    }
}
