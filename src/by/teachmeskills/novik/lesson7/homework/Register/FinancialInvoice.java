package by.teachmeskills.novik.lesson7.homework.Register;

public class FinancialInvoice extends Document implements Printable {
    int summ;
    int code;

    public FinancialInvoice(int summ, int code,int DocumentNumber,String DocumentDate) {
        super(DocumentNumber,DocumentDate);
        this.summ=summ;
        this.code=code;
    }
    public void print() {
        System.out.println("Financial Invoice\n-Monthly total: "+summ+"\n-Document Date:"+DocumentDate+"\n-Document Number: " + DocumentNumber + "\n-Department code: "+code);
    }
}
