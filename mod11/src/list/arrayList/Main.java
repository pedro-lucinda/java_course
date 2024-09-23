package list.arrayList;

import list.domain.Student;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       List<Student> students = new ArrayList<Student>();
       Student s2 = new Student("Bob", 22, 2.0);
       Student s1 = new Student("Alice", 20, 1.0, 1);

       students.add(s2);
       students.add(s1);
       System.out.println(students);
       Collections.sort(students);
       System.out.println(students);

       CompareGrades cg = new CompareGrades();
       // Pass the Comparator object to the sort method
       Collections.sort(students, cg);
       System.out.println(students);

    }
}