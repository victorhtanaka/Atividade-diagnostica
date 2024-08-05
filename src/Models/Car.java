package Models;

public class Car extends BaseModel {
    private String licensePlate;
    private String carModel;

    public Car(int id, boolean isDeleted, String licensePlate, String carModel) {
        super(id, isDeleted);
        this.licensePlate = licensePlate;
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
