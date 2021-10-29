package company;

public abstract class Vehicle {
    private final String model;
    private final String engineType;

    public Vehicle(String engineType, String model) {
        this.engineType = engineType;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
