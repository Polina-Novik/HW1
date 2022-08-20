package by.teachmeskills.novik.lesson7.homework.Register;

public class h {
    public static void main(String[] args) {


        Document[] arr = new Document[3];
        arr[0]=new ContractGoods("k",4,4,"h");
        arr[1]=new Employee("g","g",5,"h");
        arr[2]=new FinancialInvoice(8,8,8,"g");
        for (Printable pr:arr) {
            pr.print();
        }
    }
}
