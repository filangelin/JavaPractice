package practice5.task2;

public class Main {
    public static void main(String[] args) {
        PetOwner owner = new PetOwner();
        Cat kitty = new Cat();
        owner.setPet(kitty);
        owner.handlePet();
    }
}
