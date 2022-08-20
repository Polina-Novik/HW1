package by.teachmeskills.novik.lesson6.homework;

public class ATM {
    private int twenty;
    private int fifty;
    private int hundred;

    public ATM() {
    this.twenty=1000;
    this.fifty=1000;
    this.hundred=1000;
    }
    public void getSum() {
        int sum=this.twenty*20+this.fifty*50+this.hundred*100;
        System.out.println(sum);
           }
    public void addMoney(int tw,int fi,int hu) {
    this.twenty+=tw;
    this.fifty+=fi;
    this.hundred+=hu;
    }
    public void removeMoney(int value) {
        int i=0;
        int j=0;
        int k=0;
        int sum=this.twenty*20+this.fifty*50+this.hundred*100;
        if(value<sum) {
            while (value>=100) {
                value-=100;
                this.hundred--;
                i++;
            }
            while (value>=50) {
                value-=50;
                this.fifty--;
                j++;
            }
            while (value>=20) {
                value-=20;
                this.twenty--;
                k++;
            }

            if (value==0){
                System.out.println("The operation was successful. You get " + i + " hundreds, " + j +" fifties and " +k+ " twenties");
            } else {int newValue=i*100+j*50+k*20;
                System.out.println("Sorry, due to the features of the machine, we cannot give the full amount." +
                        " You get " + i + " hundreds, " + j +" fifties and " +k+ " twenties. You get "+ newValue);
            }
        }
        else {
            System.out.println("Sorry, there is not enough money in the ATM");
        }
    }
}
