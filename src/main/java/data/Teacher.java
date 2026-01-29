package data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Teacher extends AbsSchoolsWorkers {
    private String name;
    private int experience;
}
