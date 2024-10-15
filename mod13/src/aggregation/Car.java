package aggregation;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine){
        this.engine = engine;
        this.model = model;
    }

    public void showDetails() {
        System.out.println("Car Model: " + model + ", Engine Type: " + engine.getType());
    }


    public String getModel(){
        return model;
    }

    public Engine getEngine(){
        return engine;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
