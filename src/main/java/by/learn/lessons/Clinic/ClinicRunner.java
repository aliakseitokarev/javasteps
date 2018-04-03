package by.learn.lessons.Clinic;
import by.learn.lessons.Clinic.Pets.*;


import java.util.Arrays;

/**
 * Created by user on 20.03.2018. Работа клиники
 */
public class ClinicRunner {

    public static void main(String[] args) {
        final Clinic petClinic = new Clinic(10);

        petClinic.addClient(0, new Client("Brown", new Cat("Digy")));
        petClinic.addClient(1, new Client("Nick", new Dog(new Animal("Sparky"))));
        petClinic.addClient(
                2, new Client("Ann", new CatDog(new Cat("Tom"), new Dog(new Animal("Piccy"))))
        );


        System.out.println(petClinic.clients[2].getPetName());

        System.out.println(petClinic.clientName(2));

    }
}
