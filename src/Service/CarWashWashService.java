package Service;

import Models.CarWash;
import Repository.CarWashRepository;
import Repository.Context.CarWashContext;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class CarWashWashService {
    private final CarWashRepository carWashRepository = new CarWashRepository();

    public CarWash getByDateTime(String dateTime) {
        return null;
    }
    public List<CarWash> getAll() {
        return this.carWashRepository.getAll();
    }
    public CarWash getById(int id) {
        return this.getAll().stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public CarWash create(String licensePlate, String carWashModel, LocalDateTime dateTime, int carId,
                          int clientId,
                          int employeeId) {
        CarWash carWash = new CarWash(CarWashContext.lastCarWashId, false, dateTime, carId, clientId, employeeId);
        carWashRepository.create(carWash);

        return carWash;
    }
    public CarWash update(CarWash carWash) {
        return null;
    }
    public void delete(int id) {
        carWashRepository.delete(id);
    }
}
