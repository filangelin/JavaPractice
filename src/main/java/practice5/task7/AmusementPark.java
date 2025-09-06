package practice5.task7;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void showInfo() {
        attraction.info();
    }

    public void takeCare() {
        attraction.care();
    }
}
