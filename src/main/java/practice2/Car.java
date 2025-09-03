package practice2;

public class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return year;
    }

    void print() {
        System.out.println("Бренд - " + brand + " Год - " + year);
    }
}
