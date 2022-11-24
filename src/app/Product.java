package app;

// Класс-модель товара
public class Product {

    private String name; // наименование товара
    private int quantity; // количество товара
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Задекларируйте переменные, которые отражают
    // наименование, количество и цену товара.
    // Используйте самый строгий доступ к переменным.
    // Добавьте getters и setters.

}
