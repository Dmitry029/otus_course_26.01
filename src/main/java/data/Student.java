package data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student extends AbsSchoolsWorkers {

    private String name;
    private int age;

}
