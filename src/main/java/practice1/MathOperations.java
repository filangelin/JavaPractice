package practice1;

class MathOperations {

    public static void main(String[] args) {
        var sum = add(1, 2);
        System.out.println(sum);

        var sub = subtract(2, 1);
        System.out.println(sub);

        var mult = multiply(2, 3);
        System.out.println(mult);

        var div = divide(5, 3);
        System.out.println(div);

        var max = findMax(3, 8);
        System.out.println("Максимальное значение - " + max);

        var abs = difference(1, 5);
        System.out.println("Модуль  разности:" + abs);

        var area = squareArea(5);
        var perimeter = squarePerimeter(5);
        System.out.println("Площадь = " + area + " Периметр = " + perimeter);

        var minutes = convertSecondsToMinutes(120);
        System.out.println("Кол-во минут в 120 секундах " + minutes);

        var speed = averageSpeed(120, 20);
        System.out.println("Средняя скорость = " + speed);

        var hypoten = findHypotenuse(3, 4);
        System.out.println("Гипотенуза = " + hypoten);

        var cicleCircum = circleCircumference(3);
        System.out.println("Длина окружности = " + cicleCircum);

        var part = calculatePercentage(200, 25);
        System.out.println("25 из 200 = " + part);

        var inFar = celsiusToFahrenheit(30);
        System.out.println("30 градусов по Фаренгейту = " + inFar);

        var inCal = fahrenheitToCelsius(86);
        System.out.println("86 фаренгейтов в градусах цельсия = " + inCal);

    }


    static int add(int x, int y) {
        return x + y;
    }

    static int subtract(int x, int y) {
        return x - y;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static double divide(int x, int y) {
        return (double) x / y;
    }

    static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    static int squareArea(int side) {
        return side * side;
    }

    static int squarePerimeter(int side) {
        return side * 4;
    }

    static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}