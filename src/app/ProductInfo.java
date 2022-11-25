package app;

import java.util.Scanner;

import utils.Constants;

public class ProductInfo {

    static String name;
    static int quantity;
    static double price;
    static double taxRate;
    static Product product;
    static double income;
    static double tax;


    public static void Launch() {

        doInputs();

        product = new Product();

        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);

        income = Calculate.calculateIncome(product.getQuantity(), product.getPrice());
        tax = Calculate.calculateTax(income, taxRate);

        System.out.println(Constants.LINE);
        showData();
    }

    public static void doInputs() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Constants.SCAN_NAME);
        name = scanner.nextLine();

        System.out.println(Constants.SCAN_QUANTITY);
        quantity = scanner.nextInt();

        System.out.println(Constants.SCAN_PRICE);
        price = scanner.nextDouble();

        System.out.println(Constants.SCAN_TEX_RATE);
        taxRate = scanner.nextDouble();
    }

    private static void showData() {
        System.out.printf(Constants.PROD_INFO,
                product.getName(), product.getQuantity(), income, tax);
    }
}
