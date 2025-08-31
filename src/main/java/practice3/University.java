package practice3;

public class University {
    static String universityName = "МГУ";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Имя = " + studentName + " Id = " + studentID + " Университет = " + universityName);
    }

}
