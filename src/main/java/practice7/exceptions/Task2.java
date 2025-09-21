package practice7.exceptions;

public class Task2 {
    static void divide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0 невозможно");
        }
    }

    public static void main(String[] args) {
        divide(5, 0);
    }

}
