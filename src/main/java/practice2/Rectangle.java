package practice2;

public class Rectangle {
    int height;
    int width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;

    }

    void setWidth(int width) {
        this.width = width;
    }

    int getHeight() {
        return height;
    }

    int getWidth() {
        return width;
    }

    int calculateArea() {
        return height * width;
    }

    void printArea() {
        System.out.println("Площадь прямоугольника с высотой " + height + " и шириной " + width + " = " + calculateArea());
    }
}
