package gr.aueb.cf.ch20.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Teacher> teachers = List.of(
            new Teacher(1, "Alice", "W."),
            new Teacher(2, "Bob", "D."),
            new Teacher(3, "Costas", "A."));

    public static void main(String[] args) {

        List<Teacher> teachers1 = getFilteredTeacher(teachers, teacher -> teacher.getId() <= 2);
        teachers1.forEach(System.out::println);

        printTeacher(teachers, teacher -> teacher.printInstanceTeacher());
        printTeacher(teachers, Teacher::printInstanceTeacher);

        printTeacher(teachers, teacher -> Teacher.printStaticTeacher(teacher));
        printTeacher(teachers, Teacher::printStaticTeacher);

        printTeacher(teachers, teacher -> System.out.println(teacher));
        printTeacher(teachers, System.out::println);
    }

//    public static List<Teacher> getFilteredTeacher(List<Teacher> teachers, ITeacherFilter filter) {
//        List<Teacher> teachersToReturn = new ArrayList<>();
//
//        for (Teacher teacher : teachers) {
//            if (filter.filterId(teacher)) {
//                teachersToReturn.add(teacher);
//            }
//        }
//
//        return teachersToReturn;
//    }

    public static List<Teacher> getFilteredTeacher(List<Teacher> teachers, Predicate<Teacher> filter) {
        List<Teacher> teachersToReturn = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (filter.test(teacher)) {
                teachersToReturn.add(teacher);
            }
        }

        return teachersToReturn;
    }

    public static void printTeacher(List<Teacher> teachers, Consumer<Teacher> consumer) {
        for (Teacher teacher : teachers) {
            consumer.accept(teacher);
        }
    }
}
