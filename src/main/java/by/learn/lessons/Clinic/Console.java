package by.learn.lessons.Clinic;
import by.learn.lessons.Clinic.Pets.*;



import java.util.Scanner;

/**
 * Created by user on 04.04.2018.
 */
public class Console {

    Scanner reader = new Scanner(System.in);

    public Client [] addClinicData(Clinic clinic) {

        try {
            System.out.println("Введите имя клиента");
            String id = reader.next();
            System.out.println("Введите кличку питомца");
            String name = reader.next();
            System.out.println("Выберите тип питомца Cat/Dog/CatDog");
            String petType = reader.next();
            if (petType.toLowerCase() == "cat") {
                clinic.addClient(0, new Client(id, new Cat(name)));
            }


//                petClinic.addClient(0, new Client("Brown", new Cat("Digy")))
//                case "Cat" :
//                    Pet pet = new Cat(name);
//                    Client client = new Client(id, pet);
//                  //  addClinicData(clinics[0].addClient(0, client);
//                    break;
//               /* case "Dog" :
//                    Pet pet = new Dog(petType);
//                    break;*/
//                default:
//                    System.out.println("Wrong operation");




        }finally {reader.close();}
        return clinic.clients;
    }
}
