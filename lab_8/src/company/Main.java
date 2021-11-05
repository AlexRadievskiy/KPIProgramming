package company;
//ПЕРЕСДАЧА
//Объяснить работу equals
public class Main {

    public static void main(String[] args) {
        try {
            Car firstRacingCar = new Car("Electric", "Tesla", "Racing");
            Car secondRacingCar = new Car("Electric", "Tesla", "Racing");
            Car firstPassengerCar = new Car("Fuel", "Daewoo", "Passenger");
            Car secondPassengerCar = new Car("Fuel", "Daewoo");

            Boat rubberBoat = new Boat("Fuel", "Kolibri","RubberBoat");
            Boat racingBoat = new Boat("Fuel", "Kolibri","RacingBoat");

            System.out.println("First racing car = passenger car: " + firstRacingCar.equals(firstPassengerCar));
            System.out.println("Second racing car = first racing car: " + secondRacingCar.equals(firstRacingCar));
            System.out.println("Racing boat = rubber boat: " + racingBoat.equals(rubberBoat));

            System.out.println(firstRacingCar.toString());
            System.out.println(firstPassengerCar.toString());
            System.out.println(secondPassengerCar.toString());
            System.out.println(rubberBoat.toString());
            System.out.println(racingBoat.toString());

            System.out.println("Getter example: " + rubberBoat.getMaxSpeed());
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}