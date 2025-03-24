package gr.aueb.cf.ch12.exersices.model;

public class Main {

    public static void main(String[] args) {
        User user = new User(1L, "Kostas", "D.");
        UserCredentials userCredentials = new UserCredentials(3L, "kostas3", "123456");

        System.out.println(user.getId() + ", " + user.getFirstname() + ", " + user.getLastname());
        System.out.println(userCredentials.getId() + ", " + userCredentials.getUsername() + ", " + userCredentials.getPassword());
    }
}
