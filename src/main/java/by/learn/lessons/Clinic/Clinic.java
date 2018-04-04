package by.learn.lessons.Clinic;

/**
 * Created by user on 20.03.2018.
 */
public class Clinic {

    /**
     * список клиентов
     */
    final Client[] clients;

    public  Clinic(final int size){
        this.clients = new Client[size];
    }

    /**
     * добавить клиента
     * @param position позиция в списке
     * @param client человек использующий клинику
     */
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }
    public String clientName(final int i){
        return this.clients[i].getId();
    }



    public Client[] findClientsByPetName (final String name){

        Client[] findPetName = new Client[this.clients.length];
        int count = 0;
        for (Client client :clients){
            if ((client != null) && (client.getPetName().toLowerCase().equals(name.toLowerCase()))) {
                findPetName[count] = client;
                count++;
            }
        }
        if (count == 0)
        System.out.println("Не найдено совпадений");
        return findPetName;
    }
}
