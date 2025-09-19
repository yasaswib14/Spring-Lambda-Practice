package P1;

import java.util.Collections;
import java.util.List;

public class StudentService {
    public void printStudentDetails(List<Student> students) {
        Collections.sort(students, new StudentRank());
        for(Student s:students) {
            System.out.println(s);
        }
    }
}
