package gael.gson;

public class Car {

    public String manufacturer;
    public String model;
    public double capacity;
    public boolean accident;

    public Car() {
    }

    public Car(String manufacturer, String model, double capacity, boolean accident) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacity = capacity;
        this.accident = accident;
    }

    @Override
    public String toString() {
        return ("Manufacturer: " + manufacturer + ", " + "Model: " + model + ", " + "Capacity: " + capacity + ", " + "Accident: " + accident);
    }
}
