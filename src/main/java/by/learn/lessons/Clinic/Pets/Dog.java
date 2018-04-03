package by.learn.lessons.Clinic.Pets;


public class Dog implements Pet{

     final Pet pet;

    public Dog(final Pet pet) {
        this.pet = pet;
    }

    @Override
    public String getPetName() {
        return this.pet.getPetName();
    }

    @Override
    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav, Gav");
    }
}
