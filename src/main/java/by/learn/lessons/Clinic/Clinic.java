package by.learn.lessons.Clinic;

/**
 * Created by user on 20.03.2018.
 */
public class Clinic {

    /**
     * список клиентов
     */
    final Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    /**
     * добавить клиента
     *
     * @param position позиция в списке
     * @param client   человек использующий клинику
     */
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }

    public Client[] findClientsByName(final String id) { // искать клиента по имени

        Client[] clientsById = new Client[countClientsName()]; //создаем новый массив вывода результатов поиска
        int i = 0;
        for (Client client : this.clients) {
            if ((client != null) && (client.getId().equalsIgnoreCase(id))) {
                clientsById[i] = client;
                i++;
            }
        }
        if (i == 0)
            System.out.println("Не найдено совпадений");
        return clientsById;
    }


    public Client[] findClientsByPetName(final String name) { // искать клиента по кличке питомца

        Client[] clientsByName = new Client[countClientsName()]; //создаем новый массив вывода результатов поиска
        int i = 0;
        for (Client client : this.clients) {
            if ((client != null) && (client.getPetName().equalsIgnoreCase(name))) {
                clientsByName[i] = client;
                i++;
            }
        }
        if (i == 0)
            System.out.println("Не найдено совпадений");
        return clientsByName;
    }


    private int countClientsName() {
        int i = 0;
        for (Client client : clients) {   //определеям количество реальных клиентов в клинике
            if (client != null) i++;
        }
        if (i == 0) {
            System.out.println("В клинике нет клиентов");
            System.exit(0);               // выход из программы
        }
        return i;
    }

    public void editClientId(String id, String nextId) {
        int changedClient = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i]!=null && clients[i].getId().equalsIgnoreCase(id)) {
                clients[i].setId(nextId);
                changedClient++;
            }
        }
        if (changedClient == 0) System.out.println("Нет клиента с таким именем");
    }

    public void editPetName (String name, String nextPetname) {
        int changedPetName = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i]!=null && clients[i].getPetName().equalsIgnoreCase(name)) {
                clients[i].setPetName (nextPetname);
                changedPetName++;
            }
        }
        if (changedPetName == 0) System.out.println("Нет питомца с такой кличкой");
    }

    public void dellClient (String id) {

    }

}
