package practice2;

public class Product {
    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    void applyDiscount(int discount) {
        price -= price * discount / 100;
    }

    void printInfo() {
        System.out.println("Продукт - " + name + " Цена = " + price);
    }
}
