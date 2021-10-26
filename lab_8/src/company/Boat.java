package company;

public class Boat extends Vehicle {
    private String MoveMethod = "On water";
    private boolean HasWheels = false;

    public String getMoveMethod() {
        return MoveMethod;
    }
    public boolean getHasWheels() {
        return HasWheels;
    }
}