package app;

public class Calculate {
    public static double calculateIncome(int quantity, double price) {
        return quantity * price;
    }

    public static double calculateTax(double income, double taxRate) {
        return income * taxRate / 100;
    }
}
