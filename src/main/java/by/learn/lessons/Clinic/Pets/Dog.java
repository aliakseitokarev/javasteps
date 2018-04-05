package by.learn.lessons.Clinic.Pets;


public class Dog implements Pet{

     final String name;

    public Dog(final String name) {
        this.name = name;
    }

    @Override
    public String getPetName() {
        return this.name;
    }

    @Override
    public void makeSound() {
        System.out.println("Gav, Gav");
    }
}
