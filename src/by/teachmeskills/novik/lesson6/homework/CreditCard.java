package by.teachmeskills.novik.lesson6.homework;

public class CreditCard {
    private String account;
    private int amount;

    public void addMoney(int value) {
        this.amount += value;
    }

    public void removeMoney(int value) {
        if (value < amount) {
            this.amount -= value;
        } else {
            System.out.println("Not enough money on the card");
        }
    }

    public CreditCard(String account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "account='" + account + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
