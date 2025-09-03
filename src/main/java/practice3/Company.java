package practice3;

public class Company {
    static String companyName = "NoBugs";
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("Комания - " + companyName);
    }

    static void setCompanyName(String name) {
        companyName = name;
    }

    static String getCompanyName() {
        return companyName;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }
}
