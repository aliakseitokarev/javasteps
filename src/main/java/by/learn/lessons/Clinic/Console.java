package by.learn.lessons.Clinic;
import by.learn.lessons.Clinic.Pets.*;

import java.util.Scanner;


public class Console {

    Scanner reader = new Scanner(System.in);

    /*
        добавляет в клинику клиентов (на вход - клинику, на выход - массив клиентов)
     */
    public Client [] addClinicData(Clinic clinic) {
        int count = 0;
        String exit = "no";
        try {
            while (!exit.equalsIgnoreCase("yes") && count <= clinic.clients.length-1) { //проверка на превышение количества клиентов клиники

                System.out.println("Введите имя клиента");
                String id = reader.next();
                System.out.println("Введите кличку питомца");
                String name = reader.next();
                System.out.println("Выберите тип питомца Cat/Dog/CatDog");
                String petType = reader.next();

                // валидация вводных консольных данных
                while (!petType.equalsIgnoreCase("cat") && !petType.equalsIgnoreCase("dog") && !petType.equalsIgnoreCase("catdog")) {
                    System.out.println("Неверный тип питомца");
                    petType = reader.next();
                }
                if (petType.equalsIgnoreCase("cat")) {
                    clinic.addClient(count, new Client(id, new Cat(name)));
                    count++;
                } else {
                    if (petType.equalsIgnoreCase("dog")) {
                        clinic.addClient(count, new Client(id, new Dog(name)));
                        count++;
                    }else {
                        clinic.addClient(count, new Client(id, new CatDog(new Cat(name), new Dog(name))));
                        count++;
                    }
                }
                if (count <= clinic.clients.length-1) {   //не выводим если превышено количество клиентов
                    System.out.println("Exit : yes/no");
                    exit = reader.next();
                }

            }

        }finally {reader.close();} //закрываем ридер
        return clinic.clients;
    }

}
