package practice8.functionalInterface.Task1;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sudsctract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Сложение " + add.operate(5, 3));
        System.out.println("Вычитание " + sudsctract.operate(5, 3));
        System.out.println("Умножение " + multiply.operate(5, 3));
        System.out.println("Деление " + divide.operate(5, 2));
    }
}
