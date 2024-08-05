package Models;

import Models.Person;

public class Employee extends Person {
    private int roleId;
    private String CPF;
    public Employee(int id, boolean isDeleted, String name, int phoneNumber, String email, String CPF) {
        super(id, isDeleted, name, phoneNumber, email);
        this.CPF = CPF;
    }

    public void setRole(int roleId) {
        this.roleId = roleId;
    }

    public int getRole() {
        return roleId;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

}
