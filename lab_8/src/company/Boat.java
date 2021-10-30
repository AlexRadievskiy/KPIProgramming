package company;

import java.util.Objects;

public final class Boat extends Vehicle {
    private final String boatType;
    private final int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Boat(String engineType, String model, String boatType) {
        super(engineType, model);
        this.boatType = boatType;
        switch (boatType.toLowerCase()) {
            case "rubberboat" -> maxSpeed = 22;
            case "racingboat" -> maxSpeed = 49;
            default -> throw new IllegalArgumentException("Illegal boat type");
        }
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boatType='" + boatType + '\'' +
                ", maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boat boat = (Boat) o;
        return maxSpeed == boat.maxSpeed && Objects.equals(boatType, boat.boatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boatType, maxSpeed);
    }
}