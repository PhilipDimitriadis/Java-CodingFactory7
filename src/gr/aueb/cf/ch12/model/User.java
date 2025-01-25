package gr.aueb.cf.ch12.model;

public class User {
    long id;
    String firstname;
    String lastname;

    public User() {

    }

    public User(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() { return id; }
    public void setId() { this.id = id; }
    public String getFirstname() { return firstname; }
    public void setFirstname() { this.firstname = firstname; }
    public String getLastname() { return lastname; }
    public void setLastname() { this.lastname = lastname; }
}
