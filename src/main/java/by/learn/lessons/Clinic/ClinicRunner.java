package by.learn.lessons.Clinic;

/**
 * Created by user on 20.03.2018. Работа клиники
 */
public class ClinicRunner {

    public static void main(String[] args) {
        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Brown", new Cat("Digy")));
        clinic.addClient(1, new Client("Nick", new Dog(new Animal ("Sparky"))));
        clinic.addClient(
                2, new Client("Ann", new CatDog(new Cat("Tom"), new Dog(new Animal("Piccy"))))
        );

    }
}
