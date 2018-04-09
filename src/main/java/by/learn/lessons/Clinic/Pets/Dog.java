package by.learn.lessons.Clinic.Pets;


public class Dog implements Pet{

     private String name;

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

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
