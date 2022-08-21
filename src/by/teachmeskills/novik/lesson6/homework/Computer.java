package by.teachmeskills.novik.lesson6.homework;

public class Computer {
    private double price;
    private String model;

    private HDD hdd;
    private RAM ram;

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
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

        public String getNameH() {
            return nameH;
        }

        public void setNameH(String nameH) {
            this.nameH = nameH;
        }

        public int getVolumeH() {
            return volumeH;
        }

        public void setVolumeH(int volumeH) {
            this.volumeH = volumeH;
        }

        public String getTypeH() {
            return typeH;
        }

        public void setTypeH(String typeH) {
            this.typeH = typeH;
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

        public String getNameR() {
            return nameR;
        }

        public void setNameR(String nameR) {
            this.nameR = nameR;
        }

        public int getVolumeR() {
            return volumeR;
        }

        public void setVolumeR(int volumeR) {
            this.volumeR = volumeR;
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

    public Computer() {
        this.model = "default";
        this.price = 10;
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
        this.ram = new RAM();
        this.hdd = new HDD();

    }

}
