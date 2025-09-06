package practice5.task8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Exhibit sculpture = new Sculpture();
        museum.setExhibit(sculpture);
        museum.showInfo();
        museum.takeCare();
    }
}
