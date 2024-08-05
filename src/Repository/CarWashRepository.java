package Repository;

import Models.Car;
import Models.CarWash;
import Repository.Context.CarWashContext;

import java.util.List;

public class CarWashRepository implements IBaseRepository<CarWash> {
    @Override
    public List<CarWash> getAll() {
        return CarWashContext.CarWashes;
    }

    @Override
    public CarWash create(CarWash carWash) {
        CarWashContext.CarWashes.add(carWash);
        CarWashContext.lastCarWashId += 1;

        return carWash;
    }

    @Override
    public CarWash update(CarWash updatedCarWash) {
        return null;
    }

    @Override
    public void delete(int id) {
        CarWashContext.CarWashes.stream()
                .filter(x -> x.getId() == id)
                .findFirst().ifPresent(x -> x.setDeleted(true));
    }
}
