package practice2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    void setGroupName(String name) {
        groupName = name;
    }

    String getGroupName() {
        return groupName;
    }

    void setStudentCount(int count) {
        studentCount = count;
    }

    int getStudentCount() {
        return studentCount;
    }

    void printInfo() {
        System.out.println("Группа - " + groupName + " Кол-во студентов - " + studentCount);
    }
}
