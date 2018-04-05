package by.learn.lessons.Clinic.Pets;

/**
 * Created by user on 03.04.2018.
 */
public class CatDog implements Pet{
    private final Pet cat;
    private final Pet dog;

    public CatDog(Pet cat, Pet dog) {
        this.cat = cat;
        this.dog = dog;
    }

    @Override
    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }

    @Override
    public String getPetName() {
        return String.format("%s-%s", this.cat.getPetName(), this.dog.getPetName());
    }
}
