package practice3;

public class Main {
    public static void main(String[] args) {

        Company employee1 = new Company(1, "Employee1");
        Company employee2 = new Company(2, "Employee2");
        Company.setCompanyName("Changed name");
        System.out.println(employee1.getCompanyName());
        System.out.println(employee2.getCompanyName());
        // employee1.employeeID = 5; - проверка невозможности присвоить новое значение для final переменной

        int radius = 5;
        System.out.println("Радиус - " + radius + " Площадь - " + MathConstants.calculateCircleArea(radius)
                + " Длина окружности " + MathConstants.calculateCircumference(radius));
        radius = 10;
        System.out.println("Радиус - " + radius + " Площадь - " + MathConstants.calculateCircleArea(radius)
                + " Длина окружности " + MathConstants.calculateCircumference(radius));


        University student1 = new University(1, "Студент1");
        University student2 = new University(2, "Студент2");
        University student3 = new University(3, "Студент3");

        University.changeUniversityName("ЧГУ");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();


        GameSettings game1 = new GameSettings("Game1", 5);
        GameSettings game2 = new GameSettings("Game2", 2);
        GameSettings.setMaxPlayers(5);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("Иван", "Иванов", "123-45-6789");
        Person person2 = new Person("Петр", "Петров", "123-40-6780");
        person1.setFirstName("Алексей");
        person1.printPersonInfo();
        person2.printPersonInfo();

    }
}
