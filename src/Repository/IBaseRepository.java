package Repository;

import Models.Car;

import java.util.List;

public interface IBaseRepository<T> {
    List<T> getAll();
    T create(T t);
    T update(T t);
    void delete(int id);
}
