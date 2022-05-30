

public class Menus {

    public void showLoginScreen() {
        System.out.println("Bem vindo ao connect");
        System.out.print("Login:");
    }

    public void showPasswordScreen() {
        System.out.print("Senha:");
    }

    public void showLoginError() {
        System.out.println("Login Invalido Digite novamente");
    }

    public void showPasswordError() {
        System.out.println("Senha Invalido Digite novamente");
    }

    public void showOptionsMenu() {
        System.out.println("Digite o numero da opção desejada");
        System.out.println("Visualizar Produção = 1");
        System.out.println("Visualizar estoque de Equipamentos = 2");
    }

    public void showOptionError() {
        System.out.println("Opção Invalida Digite novamente");
    }
}
