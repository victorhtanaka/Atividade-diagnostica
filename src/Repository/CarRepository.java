package Repository;

import Models.Car;
import Repository.Context.CarWashContext;

import java.util.List;

public class CarRepository implements IBaseRepository<Car> {
    @Override
    public List<Car> getAll() {
        return CarWashContext.Cars;
    }

    @Override
    public Car create(Car car) {
        CarWashContext.Cars.add(car);
        CarWashContext.lastCarId += 1;

        return car;
    }

    @Override
    public Car update(Car updatedCar) {
        return null;
    }

    @Override
    public void delete(int id) {
        CarWashContext.Cars.stream()
                .filter(x -> x.getId() == id)
                .findFirst().ifPresent(car -> car.setDeleted(true));
    }
}
