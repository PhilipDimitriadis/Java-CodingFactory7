package gr.aueb.cf.ch12.model;

public class UserCredentials {
    long id;
    String username;
    String password;

    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() { return id; }
    public void setId() { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername() { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword() { this.password = password; }
}
