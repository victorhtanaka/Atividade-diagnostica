package Models;

public class BaseModel {
    private final int id;
    private boolean isDeleted;

    public BaseModel(int id, boolean isDeleted) {
        this.id = id;
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return id;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
