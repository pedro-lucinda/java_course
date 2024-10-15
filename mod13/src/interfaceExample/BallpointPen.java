package interfaceExample;

public class BallpointPen implements IPen {

    @Override
    public void write(String text) {
        System.out.println("Writing: " + text);
    }

    @Override
    public String getColor() {
        return "black";
    }
}
