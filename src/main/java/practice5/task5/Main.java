package practice5.task5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        FarmAnimal cow = new Cow();
        farm.addAnimal(cow);
        farm.takeCare();
    }
}
