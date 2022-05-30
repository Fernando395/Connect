import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        EquipmentsManager manager = new EquipmentsManager();
        Equipment equipment1 = new Equipment("CG3000", 3.33);
        manager.add(equipment1);
        Scanner input = new Scanner(System.in);
        Menus menu = new Menus();
        Production production = new Production(0);
        User user = new User("Z259693", "170815Tutu!", 464, "Fernando de Freitas Rodrigues", production);

        menu.showLoginScreen();
        while (!Objects.equals(input.next(), user.getLogin())) {
            menu.showLoginError();
        }

        menu.showPasswordScreen();
        while (!Objects.equals(input.next(), user.getPassword())) {
            menu.showPasswordError();
        }

        menu.showOptionsMenu();
        int option = input.nextInt();
        if (option == 1) {
            production.productionDetails();
        } else if (option == 2) {
            manager.list();
        } else {
            menu.showOptionError();
        }
    }
}

