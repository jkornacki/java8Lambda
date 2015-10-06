package domain;

/**
 * Created by P on 2015-10-06.
 */
public class User {
    private Role role;
    private String login;

    public User(String login, Role role) {
        this.role = role;
        this.login = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

}
