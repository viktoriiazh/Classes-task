package app;
import java.util.Scanner;
public class ProductInfo {

    static String name; // наименование товара
    static int quantity; // количество товара
    static double price; // цена товара
    static double taxRate; // ставка налога, равна 5%
    static Product product; // переменная типа Product
    static double income; // доход
    static double tax; // налог

    public static void main(String[] args) {

        // Вызов метода инициализации переменных
        doInputs();

        product = new Product();
        // Установите значения через setters.
        // Здесь ...
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);

        income = Calculate.calculateIncome(product.getQuantity(), product.getPrice());
        tax = Calculate.calculateTax(income, taxRate);

        // Вызов метода вывода данных
        showData();
    }

    // Метод инициализации переменных
    private static void doInputs() {
        // Инициализируйте переменные здесь
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        quantity = scanner.nextInt();
        price = scanner.nextDouble();
        taxRate = scanner.nextDouble();
    }

    //  Метод рассчета дохода


    // Метод вывода данных
    private static void showData() {
        System.out.printf("%s%nSold (pcs.): %d%nIncome (USD): %.2f%nTax (USD): %.2f",
                product.getName(), product.getQuantity(), income, tax);
    }
}
