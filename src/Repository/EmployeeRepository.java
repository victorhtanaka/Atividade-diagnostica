package Repository;

import Models.Employee;
import Repository.Context.CarWashContext;

import java.util.List;

public class EmployeeRepository implements IBaseRepository<Employee> {
    @Override
    public List<Employee> getAll() {
        return CarWashContext.Employees;
    }

    @Override
    public Employee create(Employee employee) {
        CarWashContext.Employees.add(employee);
        CarWashContext.lastEmployeeId += 1;

        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(int id) {
        CarWashContext.Employees.stream()
                .filter(x -> x.getId() == id)
                .findFirst().ifPresent(x -> x.setDeleted(true));
    }
}
