package exercise;

public class PhysicsPerson extends Person{
    private static final int ID_LENGTH = 11;
    private String identification;

    public PhysicsPerson(String name, String address, String phone, String email, String identification){
        super(name, address, phone, email);
        if(!isValidIdentification(identification)){
            throw new IllegalArgumentException("Invalid Identification");
        }
        this.identification = identification;
    }

    public String getIdentification(){
        return identification;
    }

    private boolean isValidIdentification(String id){
        if(id == null || id.length() != ID_LENGTH){
            return false;
        }
        return id.matches("\\d+");
    }
}
