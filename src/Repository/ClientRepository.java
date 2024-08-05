package Repository;

import Models.CarWash;
import Models.Client;
import Repository.Context.CarWashContext;

import java.util.List;

public class ClientRepository implements IBaseRepository<Client> {
    @Override
    public List<Client> getAll() {
        return CarWashContext.Clients;
    }

    @Override
    public Client create(Client client) {
        CarWashContext.Clients.add(client);
        CarWashContext.lastClientId += 1;

        return client;
    }

    @Override
    public Client update(Client t) {
        return null;
    }

    @Override
    public void delete(int id) {
        CarWashContext.Clients.stream()
                .filter(x -> x.getId() == id)
                .findFirst().ifPresent(x -> x.setDeleted(true));
    }
}
