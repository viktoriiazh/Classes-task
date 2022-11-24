package app;

public class Calculate {
    public static double calculateIncome(int quantity, double price) {
        return quantity * price;
    }

    // Метод рассчета налога
    public static double calculateTax(double income, double taxRate) {
        return income * taxRate / 100;
    }
}
