package interfaceExample;

public class Pencil implements  IPen{
    public void write(String text) {
        System.out.println("Writing: " + text);
    }

    public String getColor() {
        return "gray";
    }
}
