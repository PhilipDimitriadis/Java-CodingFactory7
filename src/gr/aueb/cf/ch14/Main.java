package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.model.Teacher;
import gr.aueb.cf.ch14.services.HelloUtil;

public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "Ath.", "Androutsos");
        Teacher teacher2 = new Teacher(2, "A." , "Giannoutsou");
        Teacher teacher3 = new Teacher(3, "C.", "Papadopoulos");

        HelloUtil.sayHello();
    }
}
