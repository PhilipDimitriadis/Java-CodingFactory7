package gr.aueb.cf.ch12.model;

public class Main {

    public static void main(String[] args) {
        User user = new User(2, "Filippos", "Dimitriadis", "philip", "12345", true);
        UserCredentials userCredentials = new UserCredentials(3L, "philip", "1234556");

        System.out.println("{ " + user.getId() + ", " + user.getFirstname() + ", " + user.getLastname() + "}");
        System.out.println("{ " + userCredentials.getId() + ", " + userCredentials.getUsername() + ", " + userCredentials.getPassword() + "}");
    }
}
