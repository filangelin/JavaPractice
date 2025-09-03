package practice2;

public class Main {
    public static void main(String[] args) {
        Car bmv = new Car("bmv", 2015);
        bmv.print();
        bmv.setYear(2020);
        bmv.print();

        Rectangle rectangle = new Rectangle(5, 6);
        rectangle.printArea();
        rectangle.setWidth(8);
        rectangle.printArea();

        Book book = new Book("Преступление и наказание", "Ф.М. Достоевский");
        book.printInfo();
        book.setAuthor("Достоевский");
        book.printInfo();

        BankAccount account = new BankAccount("Владелец", 1000.0);
        account.printBalance();
        account.deposit(1000.0);
        account.printBalance();
        account.withDraw(500.0);
        account.printBalance();

        Point point = new Point(4, 0);
        point.print();
        point.setX(1);
        point.print();

        StudentGroup group = new StudentGroup("22-17", 20);
        group.printInfo();
        group.setStudentCount(16);
        group.printInfo();

        Circle circle = new Circle(1.0);
        circle.printInfo();
        circle.setRadius(3.0);
        circle.printInfo();

        Teacher teacher = new Teacher("Анна Алексеевна", "Математика");
        teacher.printInfo();
        teacher.setSubject("Информатика");
        teacher.printInfo();

        Product coffee = new Product("Кофе", 400.0);
        coffee.printInfo();
        coffee.applyDiscount(15);
        coffee.printInfo();

        Laptop mac = new Laptop(200000.0, "macbook");
        mac.printInfo();
        mac.setPrice(195000.0);
        mac.printInfo();

    }
}
