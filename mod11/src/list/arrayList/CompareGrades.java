package list.arrayList;

import list.domain.Student;

import java.util.Comparator;

public class CompareGrades implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // lower to higher
        // return Double.compare(s1.getGrade(), s2.getGrade());
        // higher to lower
        return Double.compare(s2.getGrade(), s1.getGrade());
    }
}
