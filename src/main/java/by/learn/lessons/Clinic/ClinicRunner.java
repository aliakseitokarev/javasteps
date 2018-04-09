package by.learn.lessons.Clinic;

import by.learn.lessons.Clinic.Pets.*;

/**
 * Created by user on 20.03.2018. Работа клиники
 */
public class ClinicRunner {

    public static void main(String[] args) {
        final Clinic doctorVet = new Clinic(3);
        // Console console = new Console();
        // printer(console.addClinicData(doctorVet));

        doctorVet.addClient(0, new Client("Brown", new Cat("Benya")));
        //doctorVet.addClient(1, new Client("Nick", new Dog("Sparky")));
        doctorVet.addClient(2, new Client("Ann", new CatDog(new Cat("Tom"), new Dog("Piccy"))));

        //printer(doctorVet.findClientsByPetName("benya"));
        //printer(doctorVet.findClientsByName("ann"));
        doctorVet.editClientId("Ann", "Bobby");
        doctorVet.editPetName("Tom-Piccy", "Trone");
        printer(doctorVet.clients);


    }

    public static void printer(Client[] anyResult) {

        for (Client i : anyResult) {
            if (i != null) System.out.println(String.format("%s %s %s", i.getId(), i.getPet(), i.getPetName()));
        }
    }
}



