public class User {
    private String login;
    private String password;
    private int RE;
    private String name;
    private Production production;

    public User(String login, String password, int RE, String name, Production production) {
        this.login = login;
        this.password = password;
        this.RE = RE;
        this.name = name;
        this.production = production;
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

    public int getRE() {
        return RE;
    }

    public void setRE(int RE) {
        this.RE = RE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
