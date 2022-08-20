package by.teachmeskills.novik.lesson7.homework.Register;


    public class ContractGoods extends Document implements Printable {
        String goodsType;
        int goodsNumber;
        public ContractGoods(String goodsType, int goodsNumber,int DocumentNumber,String DocumentDate) {

            super(DocumentNumber,DocumentDate);
            this.goodsType=goodsType;
            this.goodsNumber=goodsNumber;
        }

        @Override
        public void print() {
            System.out.println("Contract for the supply of goods\n-Document Number: " + DocumentNumber +"\n-Goods Type: "+goodsType+"\n-Number of goods: "+goodsNumber+ "\n-Document Date: "+DocumentDate);
        }
    }

