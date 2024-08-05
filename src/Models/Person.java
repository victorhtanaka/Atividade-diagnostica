package Models;

public class Person extends BaseModel {
    private String name;
    private int phoneNumber;
    private String email;
    public Person(int id, boolean isDeleted, String name, int phoneNumber, String email) {
        super(id, isDeleted);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
