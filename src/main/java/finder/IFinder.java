package finder;

import data.AbsSchoolsWorkers;
import data.Student;

public interface IFinder<T extends AbsSchoolsWorkers> {

    T search(T student);
}
