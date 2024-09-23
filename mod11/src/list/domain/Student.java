package list.domain;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int id;
    private Double grade;

    public Student(String name, int age, Double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age, Double grade, int id) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.id = id;
    }

    public Double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Double setGrade(Double grade) {
        return this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    /**
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return name + " (" + age + ") [" + id + "] - " + grade;
    }

    /**
     * Compares this object with the specified object for order.
     * @param student the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object is less than,
     * equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.getName());
    }
}
