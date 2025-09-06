package practice5.task2;

public class PetOwner {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void handlePet() {
        pet.feed();
        pet.spendTime();
    }
}
