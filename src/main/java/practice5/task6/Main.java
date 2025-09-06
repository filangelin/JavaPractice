package practice5.task6;

public class Main {
    public static void main(String[] args) {
        BotanicGarden garden = new BotanicGarden();
        Plant cactus = new Cactus();
        garden.setPlant(cactus);
        garden.care();
    }
}
