package P1;

import java.util.Comparator;

public class StudentRank implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        if(s2.getMarks() != s1.getMarks()) {
            return Integer.compare(s2.getMarks(), s1.getMarks());
        }else {
            return Integer.compare(s1.getStudentId(), s2.getStudentId());
        }
    }
}
