package practice7.exceptions;

public class Task3 {

    static void validateAge(int age) throws AgeException {
        if (age < 0 || age > 150) {
            throw new AgeException("Невалидный возраст");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(160);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

