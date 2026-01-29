package finder;

import data.Student;
import data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pasha", 12));
        students.add(new Student("Sasha", 23));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Pasha", 12));
        teachers.add(new Teacher("Sasha", 23));

        IFinder<Student> finder = new Finder<>(students);
        Student result = finder.search(new Student("Pasha", 12));

        IFinder<Teacher> finder2 = new Finder<>(teachers);
        Teacher result2 = finder2.search(new Teacher("Pasha", 12));

    }
}
