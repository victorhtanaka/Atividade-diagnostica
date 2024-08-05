package Models;

import Models.Car;

import java.time.LocalDateTime;

public class CarWash extends BaseModel {
    private LocalDateTime dateTime;
    private int carId;
    private int clientId;
    private int employeeId;

    public CarWash(int id, boolean isDeleted, LocalDateTime dateTime, int carId, int clientId, int employeeId) {
        super(id, isDeleted);
        this.dateTime = dateTime;
        this.carId = carId;
        this.clientId = clientId;
        this.employeeId = employeeId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getCar() {
        return carId;
    }

    public void setCar(int CarId) {
        this.carId = carId;
    }

    public int getClient() {
        return clientId;
    }

    public void setClient(int clientId) {
        this.clientId = clientId;
    }

    public int getEmployee() {
        return employeeId;
    }

    public void setEmployee(int employeeId) {
        this.employeeId = employeeId;
    }
}
