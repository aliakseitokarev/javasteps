package by.learn.lessons.Clinic;

/**
 * Created by user on 20.03.2018.
 */
public class Clinic {

    /**
     * список клиентов
     */
    private final Client[] clients;

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

    public Client[] findClientsByPetName (final String name){
        // реализовать
        return new Client[]{};
    }
}
