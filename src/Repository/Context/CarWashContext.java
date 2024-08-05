package Repository.Context;

import Models.*;

import java.util.ArrayList;
import java.util.List;

public class CarWashContext {
    // Db improvisado
    // & Super mega gambiarra de autoincrement
    public static int lastClientId = 0;
    public static List<Client> Clients = new ArrayList<>();
    public static int lastEmployeeId = 0;
    public static List<Employee> Employees = new ArrayList<>();
    public static int lastCarId = 0;
    public static List<Car> Cars = new ArrayList<>();
    public static int lastCarWashId = 0;
    public static List<CarWash> CarWashes = new ArrayList<>();
    public static int lastRoleId = 0;
    public static List<Role> Roles = new ArrayList<>();
    public static int lastUserId = 0;
    public static List<User> Users = new ArrayList<>();
}