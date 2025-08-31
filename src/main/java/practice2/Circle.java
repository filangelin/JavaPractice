package practice2;

public class Circle {
    Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    Double calculateArea() {
        return Math.PI * radius * radius;
    }

    Double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void printInfo() {
        System.out.println("Радиус = " + radius + " Площадь = " + calculateArea() + " Длина окружности = " + calculateCircumference());
    }
}
