package practice2;

public class Laptop {
    String brand;
    Double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Laptop(Double price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    void printInfo() {
        System.out.println("Ноутбук - " + brand + " Цена = " + price);
    }
}
