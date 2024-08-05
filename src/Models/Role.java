package Models;

public class Role extends BaseModel {
    private String role;
    private double salary;
    public Role(int id, boolean isDeleted, String role, double salary) {
        super(id, isDeleted);
        this.role = role;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
