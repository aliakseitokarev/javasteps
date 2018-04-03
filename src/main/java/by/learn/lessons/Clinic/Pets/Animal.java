package by.learn.lessons.Clinic.Pets;

/**
 * создаем класс животного
 */
public class Animal implements Pet {
     final String name;

    public Animal(final String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(String.format("%s say : %s", this.name, "beep"));
    }

    @Override
    public String getPetName() {
        return this.name;
    }
}
