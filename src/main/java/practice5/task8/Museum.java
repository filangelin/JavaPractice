package practice5.task8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showInfo() {
        exhibit.showHistory();
    }

    public void takeCare() {
        exhibit.care();
    }
}
