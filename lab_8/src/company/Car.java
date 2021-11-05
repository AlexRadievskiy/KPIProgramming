package company;

import java.util.Objects;

public final class Car extends Vehicle {
    private final String carType;
    private final int maxSpeed;

    public Car(String engineType, String model, String carType) {
        super(engineType, model);
        this.carType = carType;
        switch (carType.toLowerCase()) {
            case "racing" -> maxSpeed = 220;
            case "passenger" -> maxSpeed = 120;
            default -> throw new IllegalArgumentException("Illegal car type");
        }
    }

    public Car(String engineType, String model) {
        super(engineType, model);
        carType = "none";
        maxSpeed = 0;
    }

//    public String getCarType() {
//        return carType;
//    }
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(carType, car.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carType, maxSpeed);

    }
}
