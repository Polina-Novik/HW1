package by.teachmeskills.novik.lesson6.homework;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        Computer.RAM ram = c1.new RAM("Super Operativka", 16);
        Computer.HDD hdd = c1.new HDD("Super Disk", 32, "external");
        Computer c2 = new Computer(10000, "Asus", ram, hdd);

    }
}
