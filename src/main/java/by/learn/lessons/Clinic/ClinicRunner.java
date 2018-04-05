package by.learn.lessons.Clinic;

/**
 * Created by user on 20.03.2018. Работа клиники
 */
public class ClinicRunner {

    public static void main(String[] args) {
        final Clinic doctorVet = new Clinic(2);
        Console console = new Console();
        printer(console.addClinicData(doctorVet));
        printer(doctorVet.findClientsByPetName("benya"));



        /*petClinic.addClient(0, new Client("Brown", new Cat("Digy")));
        petClinic.addClient(1, new Client("Nick", new Dog(new Animal("Sparky"))));
        petClinic.addClient(
                2, new Client("Ann", new CatDog(new Cat("Tom"), new Dog(new Animal("Piccy"))))
        );


        printer(petClinic.findClientsByPetName("Sparky"));

        System.out.println(petClinic.clients[2].getPetName());

        System.out.println(petClinic.clientName(2)); */

    }

    public static void printer (Client[] anyResult) {

        for (Client i : anyResult) {
            if (i != null) System.out.println(i.getPetName());
        }
    }
}
