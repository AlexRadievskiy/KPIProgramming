package company;

public class Car extends Vehicle {
    private String MoveMethod = "By land";
    private boolean HasWheels = true;

    public String getMoveMethod() {
        return MoveMethod;
    }
    public boolean getHasWheels() {
        return HasWheels;
    }
}
