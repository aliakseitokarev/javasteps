package by.learn.lessons.Clinic.Pets;


public class Cat extends Animal {



    public Cat(final String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("May %s", this.getPetName()));
    }
}
