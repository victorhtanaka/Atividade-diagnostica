package Repository;

import Models.Role;
import Repository.Context.CarWashContext;

import java.util.List;

public class RoleRepository implements IBaseRepository<Role> {
    @Override
    public List<Role> getAll() {
        return CarWashContext.Roles;
    }

    @Override
    public Role create(Role role) {
        CarWashContext.Roles.add(role);
        CarWashContext.lastRoleId += 1;

        return role;
    }

    @Override
    public Role update(Role role) {
        return null;
    }

    @Override
    public void delete(int id) {
        CarWashContext.Roles.stream()
                .filter(x -> x.getId() == id)
                .findFirst().ifPresent(x -> x.setDeleted(true));
    }
}
