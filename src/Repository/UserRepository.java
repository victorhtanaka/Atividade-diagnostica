package Repository;

import Models.Car;
import Models.User;
import Repository.Context.CarWashContext;

import java.util.List;

public class UserRepository implements IBaseRepository<User> {
    @Override
    public List<User> getAll() {
        return CarWashContext.Users;
    }

    @Override
    public User create(User user) {
        CarWashContext.Users.add(user);
        CarWashContext.lastUserId += 1;

        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(int id) {
        CarWashContext.Users.stream()
                .filter(x -> x.getId() == id)
                .findFirst().ifPresent(user -> user.setDeleted(true));
    }
}
