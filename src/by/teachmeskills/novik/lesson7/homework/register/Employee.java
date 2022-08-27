package by.teachmeskills.novik.lesson7.homework.register;

public class Employee extends Document implements Printable {
    private String endDate;
    private String name;

    public void setDocumentNumber(int documentNumber) {
        super.setDocumentNumber(documentNumber);
    }

    public Employee(String endDate, String name, int documentNumber, String documentDate) {
        super(documentNumber, documentDate);

        //supergetDN for private
        this.endDate = endDate;
        this.name = name;
    }

    @Override
    public int getDocumentNumber() {
        return super.getDocumentNumber();
    }

    @Override
    public String getDocumentDate() {
        return super.getDocumentDate();
    }

    public void print() {
        System.out.println("Contract with an employee\n-Document Number: " + getDocumentNumber() + "\n-Document Date: " + getDocumentDate() + "\n-Contract end date: " + endDate + "\n-Employee name: " + name);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}