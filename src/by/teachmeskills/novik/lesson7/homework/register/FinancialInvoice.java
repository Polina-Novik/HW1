package by.teachmeskills.novik.lesson7.homework.register;

public class FinancialInvoice extends Document implements Printable {
    private int summ;
    private int code;

    public FinancialInvoice(int summ, int code, int DocumentNumber, String DocumentDate) {
        super(DocumentNumber, DocumentDate);
        this.summ = summ;
        this.code = code;
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
        System.out.println("Financial Invoice\n-Monthly total: " + summ + "\n-Document Date:" + documentDate + "\n-Document Number: " + documentNumber + "\n-Department code: " + code);
    }

    public int getSumm() {
        return summ;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
