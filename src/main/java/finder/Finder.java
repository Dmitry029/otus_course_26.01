package finder;

import data.AbsSchoolsWorkers;

import java.util.List;

public class Finder<T extends AbsSchoolsWorkers> implements IFinder<T> {

    private List<T> students;

    public Finder(List<T> students) {
        this.students = students;
    }

    @Override
    public T search(T student) {
        return students.stream()
            .filter(s -> s.equals(student)).findFirst().get();
    }
}
