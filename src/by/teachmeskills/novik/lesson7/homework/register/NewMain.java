package by.teachmeskills.novik.lesson7.homework.register;


import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class NewMain {


    public static void main(String[] args) {
        Register r = new Register(10);


        System.out.println("Select contract type\n1.Contract for the supply of goods\n2.Contract with an employee\n3.Financial Invoice\n4.End");
        Scanner scanner = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner co = new Scanner(System.in);
        int choose = scanner.nextInt();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 0, j = 1; i < 10; j++) {
            switch (choose) {
                case 1:
                    System.out.println("Please enter goods number");
                    int goodsNumber = scanner.nextInt();
                    System.out.println("goods type");
                    int documentNumber = j;
                    String goodsType = console.nextLine();
                    String documentDate = simpleDateFormat.format(new Date());
                    r.addDocument(new ContractGoods(goodsType, goodsNumber, documentNumber, documentDate));
                    break;
                case 2:
                    System.out.println("Please enter contract end date");
                    String endDate = s.nextLine();
                    System.out.println("Employee name");
                    documentNumber = j;
                    String name = c.nextLine();

                    documentDate = simpleDateFormat.format(new Date());
                    r.addDocument(new Employee(endDate, name, documentNumber, documentDate));

                    break;
                case 3:
                    System.out.println("Please enter monthly total ");
                    int summ = sc.nextInt();
                    System.out.println("Department code");
                    documentNumber = j;
                    int code = co.nextInt();

                    documentDate = simpleDateFormat.format(new Date());
                    r.addDocument(new FinancialInvoice(summ, code, documentNumber, documentDate));

                    break;
                case 4:

                    break;
            }
            i++;
            if (i < 10 && choose != 4) {
                System.out.println("Select contract type\n1.Contract for the supply of goods\n2.Contract with an employee\n3.Financial Invoice\n4.End");
                choose = scanner.nextInt();
            }
        }

        r.print();

    }
}

