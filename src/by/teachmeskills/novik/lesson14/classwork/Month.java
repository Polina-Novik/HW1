package by.teachmeskills.novik.lesson14.classwork;

public enum Month {
    //always twelve, always same month
    JANUARY(1), FEBRUARY(2), MARCH(3);
    private final int number;
    Month(int number) {
        this.number=number;
    }
    public int getNumber() { //can't set, they are constants
        return number;
    }
}
