package practice4;

import java.util.Scanner;

public class BreakContinueTasksSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //sumNumbers();
        //skipDividingBy3();
        //printOnlyPositive();
        makeCommands();
    }

    static void sumNumbers() {
        int sum = 0;
        while (true) {
            System.out.println("Введите число");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Cумма = " + sum);
    }

    static void skipDividingBy3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    static void printOnlyPositive() {
        int number;
        do {
            System.out.println("Введите число, для выхода нажмите 0");
            number = scanner.nextInt();
            if (number<0) {
                continue;
            }
            System.out.println(number);

        } while (number!=0);
    }

    static void makeCommands() {
        String command;
        while (true) {
            System.out.println("Введите команду");
            command = scanner.next();
            if ("stop".equals(command)) {
                break;
            }
            System.out.println(command);
        }
    }
}
