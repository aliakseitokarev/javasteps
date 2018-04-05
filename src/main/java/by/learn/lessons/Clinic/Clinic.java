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

        int count = 0;
        for (Client client : clients) {   //определеям количество реальных клиентов в клинике
            if (client != null) count++;
        }
        if (count != 0) {
            Client[] findClient = new Client[count]; //создаем новый массив вывода результатов поиска

            for (Client client : clients){
                if ((client != null) && (client.getPetName().equalsIgnoreCase(name))) {
                    findClient[count] = client;
                    count++;
                }
            }
            if (count == 0)
                System.out.println("Не найдено совпадений");

            return findClient;
        }
        System.out.println("В клинике нет клиентов");

        return null;
    }
}
