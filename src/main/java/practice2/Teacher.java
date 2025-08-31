package practice2;

public class Teacher {
    String name;
    String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void printInfo() {
        System.out.println("Преподаватель - " + name + " Предмет - " + subject);
    }
}
