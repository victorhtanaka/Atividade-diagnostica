package Service;

import Models.Car;
import Repository.Context.CarWashContext;
import Repository.CarRepository;

import java.util.List;
import java.util.Objects;

public class CarService {
    private final CarRepository carRepository = new CarRepository();

    public Car getByLicensePlate(String licensePlate) {
        return getAll().stream().filter(x -> Objects.equals(x.getLicensePlate(), licensePlate))
                .findFirst()
                .orElse(null);
    }
    public List<Car> getAll() {
        return this.carRepository.getAll();
    }
    public Car getById(int id) {
        return this.getAll().stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public Car create(String licensePlate, String carModel) {
        Car car = new Car(CarWashContext.lastCarId, false, licensePlate, carModel);
        carRepository.create(car);

        return car;
    }
    public Car update(Car car) {
        return null;
    }
    public void delete(int id) {
        carRepository.delete(id);
    }
}
