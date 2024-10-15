package interfaceExample;

public class Main {
    public static void main(String[] args) {
        IPen pen = new Pen();
        IPen pencil = new Pencil();
        IPen ballpointPen = new BallpointPen();

        System.out.println("interfaceExample.Pen color: " + pen.getColor());
        pen.write("Hello");

        System.out.println("interfaceExample.Pencil color: " + pencil.getColor());
        pencil.write("Hello");

        System.out.println("Ballpoint pen color: " + ballpointPen.getColor());
        ballpointPen.write("Hello");
        }
    }

