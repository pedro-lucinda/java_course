package interfaceExample;

public interface IPen {
    public void write(String text);
    public String getColor();

    // (default) doesn't need to be implemented by the classes that implement this interface
    default void writeAll(){
        System.out.println("Writing all");
    }
}
