package by.teachmeskills.novik.lesson7.homework.register;


import by.teachmeskills.novik.lesson7.classwork.Computer;

public class ContractGoods extends Document implements Printable {
    private String goodsType;
    private int goodsNumber;


    public ContractGoods(String goodsType, int goodsNumber, int documentNumber, String documentDate) {

        super(documentNumber, documentDate);
        this.goodsType = goodsType;
        this.goodsNumber = goodsNumber;

    }

    @Override
    public int getDocumentNumber() {
        return super.getDocumentNumber();
    }

    @Override
    public String getDocumentDate() {
        return super.getDocumentDate();
    }

    @Override
    public void print() {
        System.out.println("Contract for the supply of goods\n-Document Number: " + documentNumber + "\n-Goods Type: " + goodsType + "\n-Number of goods: " + goodsNumber + "\n-Document Date: " + documentDate);
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
}

