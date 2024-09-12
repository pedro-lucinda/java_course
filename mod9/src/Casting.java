public class Casting {

    public static void main(String[] args) {
        int age = 25;
        System.out.println(age);

        Integer age2 = age; // Implicit
        // Integer age2 = (Integer) age; // Explicit
        System.out.println(age2);
    }
}