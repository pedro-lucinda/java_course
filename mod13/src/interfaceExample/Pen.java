package interfaceExample;

public class Pen implements IPen {

    @Override
    public void write(String text) {
        System.out.println("Writing: " + text);
    }

    @Override
    public String getColor() {
        return "blue";
    }

}
