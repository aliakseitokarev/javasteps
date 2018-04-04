package by.learn.lessons.Clinic;
import by.learn.lessons.Clinic.Pets.*;



import java.util.Scanner;

/**
 * Created by user on 04.04.2018.
 */
public class ConsoleRunner {

    public Clinic[] clinics;

    Scanner reader = new Scanner(System.in);

    public ConsoleRunner(int size) {
        this.clinics = new Clinic[size];
    }

    public void inputData () {

        try {
            System.out.println("Введите имя клиента");
            String id = reader.next();
            System.out.println("Введите кличку питомца");
            String name = reader.next();
            System.out.println("Выберите тип питомца Cat/Dog/CatDog");
            String petType = reader.next();
            switch (petType) {
                case "Cat" :
                    Pet pet = new Cat(name);
                    Client client = new Client(id, pet);
                    inputData(clinics[0].addClient(0, client);
                    break;
               /* case "Dog" :
                    Pet pet = new Dog(petType);
                    break;*/
                default:
                    System.out.println("Wrong operation");

            }

        }finally {reader.close();}
    }
}
