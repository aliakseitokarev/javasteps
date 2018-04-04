package by.learn.lessons.Clinic;

import by.learn.lessons.Clinic.Pets.Pet;

/**
 * Created by user on 20.03.2018.
 */
public class Client {
     private final String id;
     private final Pet pet;

    public Client(String id, Pet pet){
        this.id = id;
        this.pet = pet;
    }

    //возвращает имя клиента
    public String getId() {
        return id;
    }

    //возвращает тип питомца
    public String getPet() {
        return pet.getClass().getSimpleName();
    }

    //возвращает имя питомца
    public String getPetName(){
        return pet.getPetName();
    }
}
