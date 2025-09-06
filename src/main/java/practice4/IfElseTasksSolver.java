package practice4;

import java.util.Scanner;

public class IfElseTasksSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //defineNumberSign();
        //findMax();
        //printMark();
        //isEven();
        //chooseDiscount();
        //printTestMark();
    }


    static void defineNumberSign() {
        int number = scanner.nextInt();

        String definition;
        if (number > 0) {
            definition = "Число положительное";
        } else if (number < 0) {
            definition = "Число отрицательное";
        } else definition = "Число равно нулю";

        System.out.println(definition);
    }

    static void findMax() {
        System.out.println("Первое число - ");
        int number1 = scanner.nextInt();
        System.out.println("Второе число - ");
        int number2 = scanner.nextInt();
        System.out.println("Максимальное = " + Math.max(number1, number2));

    }

    static void printMark() {
        System.out.println("Введите оценку:");
        String markDefinition;
        int mark = scanner.nextInt();
        if (mark == 1 || mark == 2) {
            markDefinition = "Неудовлетворительно";
        } else if (mark == 3) {
            markDefinition = "Удовлетворительно";
        } else if (mark == 4) {
            markDefinition = "Хорошо";
        } else if (mark == 5) {
            markDefinition = "Отлично";
        } else markDefinition = "Введите оценку от 1 до 5";
        System.out.println(markDefinition);
    }

    static void isEven() {
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        var definition = number % 2 == 0 ? "Число четное" : "Число нечетное";
        System.out.println(definition);
    }

    static void chooseDiscount() {
        System.out.println("Введите возраст ");
        int age = scanner.nextInt();
        int discount;
        if (age < 18) {
            discount = 25;
        } else if (age >= 65) {
            discount = 30;
        } else discount = 0;
        System.out.println("Размер скидки = " + discount + "%");
    }

    static void printTestMark() {
        System.out.println("Введите балл:");
        String markDefinition;
        int mark = scanner.nextInt();
        if (mark >= 0 && mark < 60) {
            markDefinition = "Неудовлетворительно";
        } else if (mark >= 60 && mark < 75) {
            markDefinition = "Удовлетворительно";
        } else if (mark >= 75 && mark < 90) {
            markDefinition = "Хорошо";
        } else if (mark >= 90 && mark <= 100) {
            markDefinition = "Отлично";
        } else markDefinition = "Введите балл от 0 до 100";
        System.out.println(markDefinition);
    }
}
