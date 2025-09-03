package practice4;

import java.util.Scanner;

public class SwitchTasksSolver {
    static Scanner scanner = new Scanner(System.in);

    static void printDayOfWeek() {
        System.out.println("Введите номер дня:");
        int day = scanner.nextInt();
        String dayOfWeek = switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Cреда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Некорректное число";
        };
        System.out.println(dayOfWeek);
    }

    static void defineTicketCost() {
        int day = scanner.nextInt();
        int cost = switch (day) {
            case 1, 2, 3, 4, 5 -> 300;
            case 6, 7 -> 450;
            default -> throw new IllegalArgumentException();
        };
        System.out.println("Цена билета = " + cost + " рублей");
    }

    static void mapToLiteralMark() {
        int mark = scanner.nextInt();
        String literalMark;
        if (mark >= 0 && mark < 60) {
            literalMark = "F";
        } else if (mark >= 60 && mark < 70) {
            literalMark = "D";
        } else if (mark >= 70 && mark < 80) {
            literalMark = "C";
        } else if (mark >= 80 && mark < 90) {
            literalMark = "B";
        } else if (mark >= 90 && mark <= 100) {
            literalMark = "A";
        } else literalMark = "Некорректное значение";
        System.out.println(literalMark);
    }

    static void makeTextCommand() {
        String command = scanner.nextLine();
        String commandDefinition = switch (command) {
            case "start" -> "Система запущена";
            case "stop" -> "Система остановлена";
            case "restart" -> "Система перезапущена";
            case "status" -> "Статус системы";
            default -> "Неизвестная команда";
        };
        System.out.println(commandDefinition);
    }

    static void calculate() {
        System.out.println("Первое число ");
        int x = scanner.nextInt();
        System.out.println("Второе число ");
        int y = scanner.nextInt();
        System.out.println("Оператор");
        String operator = scanner.next();
        Double result;
        switch (operator) {
            case "+": {
                result = (double) x + y;
                break;
            }
            case "-": {
                result = (double) x - y;
                break;
            }
            case "*": {
                result = (double) x * y;
                break;
            }
            case "/": {
                if (y != 0) {
                    result = (double) x / y;
                } else throw new IllegalArgumentException("Делитель не может быть нулем");
                break;
            }
            default:
                throw new IllegalArgumentException("Неизвестный оператор");
        }
        System.out.println(x + operator + y + " = " + result);
    }


}
