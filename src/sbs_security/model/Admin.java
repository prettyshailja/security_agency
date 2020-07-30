
package sbs_security.model;

public class Admin {
    private int id;
    private String email_id;

    public Admin(int id, String email_id, String username, String password) {
        this.id = id;
        this.email_id = email_id;
        this.username = username;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public String getEmail_id() {
        return email_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    private String username;
    private String password;
}
