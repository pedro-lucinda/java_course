package list.linkedList;

import list.domain.Student;

import java.util.LinkedList;
import java.util.List;

// Linked list - fast writes and slow reads
public class Main {

    public static void main(String[] args){
        System.out.println("Hello, World!");
        List<String> linked = new LinkedList<String>();
        linked.add("Bob");
        linked.add("Alice");
        linked.add("Trudy");

        linked.remove(1);

        System.out.println(linked);

        List<Student> students = new LinkedList<Student>();

        Student s2 = new Student("Bob", 22, 2.0);
        Student s1 = new Student("Alice", 20, 1.0, 1);

        students.add(s2);
        students.add(s1);

        System.out.println(students);
    }
}
