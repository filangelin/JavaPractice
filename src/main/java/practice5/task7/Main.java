package practice5.task7;

public class Main {
    public static void main(String[] args) {
        Attraction carousel = new Carousel();
        AmusementPark park = new AmusementPark();
        park.setAttraction(carousel);
        park.showInfo();
        park.takeCare();
    }
}
