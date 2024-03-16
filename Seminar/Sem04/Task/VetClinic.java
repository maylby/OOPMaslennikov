package OOP.Seminar.Sem04.Task;

import java.util.ArrayList;

public class VetClinic<T> {
    private T client;
    private ArrayList<T> clients = new ArrayList<>();

    public VetClinic(T client) {
        this.client = client;
    }

    public VetClinic() {

    }

    public void add(T cl) {
        clients.add(cl);
    }

    public T getClient() {
        return client;
    }

    public void setClient(T client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Клиент{" + client + '}';
    }

    public void help(T client) {
        for (T t : clients) {
            if (t.equals(client)) {
                System.out.printf("%s принят\n", client);
            }
        }
    }
}
