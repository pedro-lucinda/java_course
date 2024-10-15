package exercise;

public class Main {
    public static void main(String[] args) {
        Person person1 = new JuridicPerson("Juridic Person", "Juridic Address", "123456789", "person@gmail.com", "123456789");
        Person person2 = new PhysicsPerson("Physics Person", "Physics Address", "987654321", "person2@gmail.com", "12345678911");

        System.out.println("Person 1 name: " + person1.getName());
        System.out.println("Person 1 Employer Identification Number: " + ((JuridicPerson) person1).getEmployerIdentificationNumber());

        System.out.println("Person 2 name: " + person2.getName());
        System.out.println("Person 2 Identification: " + ((PhysicsPerson) person2).getIdentification());
    }
}
