package by.teachmeskills.novik.lesson6.homework;

public class Computer {
    private double price;
    private String model;
    private HDD hdd = new HDD();
    private RAM ram = new RAM();

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }

    public class HDD {
        private String nameH;
        private int volumeH;
        private String typeH;

        public HDD() {
        }

        public HDD(String nameH, int volumeH, String typeH) {
            this.nameH = nameH;
            this.volumeH = volumeH;
            this.typeH = typeH;
        }

        @Override
        public String toString() {
            return "HDD{" +
                    "nameH='" + nameH + '\'' +
                    ", volumeH=" + volumeH +
                    ", typeH='" + typeH + '\'' +
                    '}';
        }
    }


    public class RAM {
        private String nameR;
        private int volumeR;

        public RAM() {
        }

        public RAM(String nameR, int volumeR) {
            this.nameR = nameR;
            this.volumeR = volumeR;
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "nameR='" + nameR + '\'' +
                    ", volumeR=" + volumeR +
                    '}';
        }
    }


    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        System.out.println("Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +

                '}');

    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        System.out.println("Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}');
    }
}
