package aggregation;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car("Ford Mustang", engine);

        car.showDetails();
    }
}
