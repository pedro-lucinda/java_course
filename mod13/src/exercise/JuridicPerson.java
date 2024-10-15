package exercise;

public class JuridicPerson extends Person{
    private static final int EIN_LENGTH = 9;
    private final String EmployerIdentificationNumber;

    public JuridicPerson(String name, String address, String phone, String email, String EmployerIdentificationNumber){
        super(name, address, phone, email);
        if(!isValidEmployerIdentificationNumber(EmployerIdentificationNumber)){
            throw new IllegalArgumentException("Invalid Employer Identification Number");
        }
        this.EmployerIdentificationNumber = EmployerIdentificationNumber;
    }

    public String getEmployerIdentificationNumber(){
        return EmployerIdentificationNumber;
    }

    private boolean isValidEmployerIdentificationNumber(String ein) {
        // Check if EIN is of the correct length and format
        if (ein == null || ein.length() != EIN_LENGTH) {
            return false;
        }
        return ein.matches("\\d+"); // ensures it's numeric
    }
}
