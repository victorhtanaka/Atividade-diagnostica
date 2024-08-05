package Service;

import Models.Car;
import Models.User;
import Repository.Context.CarWashContext;
import Repository.UserRepository;

import java.util.List;
import java.util.Objects;

public class UserService {
    UserRepository userRepository = new UserRepository();
    public User getByLogin(String login) {
        return getAll().stream().filter(x -> Objects.equals(x.getLogin(), login))
                .findFirst()
                .orElse(null);
    }
    public List<User> getAll() {
        return userRepository.getAll();
    }
    public User getById(int id) {
        return getAll().stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public User create(String login, String password) {
        User user = new User(CarWashContext.lastUserId, false, login, password);
        userRepository.create(user);

        return user;
    }
    public User update(User user) {
        return null;
    }
    public void delete(int id) {
        userRepository.delete(id);
    }
}
