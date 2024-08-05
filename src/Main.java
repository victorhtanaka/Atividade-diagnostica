import Models.*;
import Service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static UserService userService = new UserService();
    public static void main(String[] args) {
        // Inicializa usuarios padroes
        userInitilize();

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o login");
        String login = read.next();

        System.out.println("Digite a senha");
        String password = read.next();

        if (verifyPassword(login, password)) {
            openFeatures(login);
        }
    }
    public static boolean verifyPassword(String login, String password) {
        return Objects.equals(userService.getByLogin(login).getPassword(), password);
    }
    public static void openFeatures(String login) {
        if (login.equals("admin")) {
            openAdminTab();
            return;
        }
        openEmployeeTab();
    }
    private static void userInitilize() {
        User adminUser = userService.create("admin", "123");
        User employeeUser = userService.create("employee", "123");
    }
    public static void openAdminTab() {
        System.out.println("selecione a funcionalidade:\n" +
                "1 - Funcionarios\n" +
                "2 - Lavagens\n" +
                "3 - Clientes\n" +
                "4 - Usuários\n" +
                "5 - Cargos");
        // Logica das funcionalidades
    }
    public static void openEmployeeTab() {
        System.out.println("selecione a funcionalidade:\n" +
                "1 - Carros\n" +
                "2 - Lavagens\n" +
                "3 - Clientes\n");
        // Logica das funcionalidades
    }
}