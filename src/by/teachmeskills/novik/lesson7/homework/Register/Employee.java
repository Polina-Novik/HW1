package by.teachmeskills.novik.lesson7.homework.Register;

public class Employee extends Document implements Printable {
    String endDate;
    String name;
    public Employee(String endDate,String name,int DocumentNumber,String DocumentDate) {
        super(DocumentNumber,DocumentDate);
        this.endDate=endDate;
        this.name=name;
    }

    public void print() {
        System.out.println("Contract with an employee\n-Document Number: " + DocumentNumber + "\n-Document Date: "+DocumentDate+"\n-Contract end date: "+endDate+"\n-Employee name: "+name);
    }
}