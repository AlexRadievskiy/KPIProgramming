package company;

public class Main {

    public static void main(String[] args) {
        try {
            Car firstRacingCar = new Car("Electric", "Tesla", "Racing");
            Car secondRacingCar = new Car("Electric", "Tesla", "Racing");
            Car passengerCar = new Car("Fuel", "Daewoo", "Passenger");

            Boat rubberBoat = new Boat("Fuel", "Kolibri","RubberBoat");
            Boat racingBoat = new Boat("Fuel", "Kolibri","RacingBoat");

            System.out.println("Racing car = passenger car: " + firstRacingCar.equals(passengerCar));
            System.out.println("Second car = passenger car: " + secondRacingCar.equals(firstRacingCar));
            System.out.println("Racing boat = rubber boat: " + racingBoat.equals(rubberBoat));

            System.out.println(firstRacingCar.toString());
            System.out.println(passengerCar.toString());
            System.out.println(rubberBoat.toString());
            System.out.println(racingBoat.toString());

            System.out.println("Getter example: " + rubberBoat.getBoatType());
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}