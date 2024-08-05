package Models;

public class User extends BaseModel {
    private String login;
    private String password;
    public User(int id, boolean isDeleted, String login, String password) {
        super(id, isDeleted);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
