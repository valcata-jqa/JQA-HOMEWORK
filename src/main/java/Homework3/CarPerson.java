package Homework3;

public class CarPerson {
    public static void main(String[] args) {
        Car firstCar = new Car();
        Car secondCar = new Car();

        firstCar.year = 2019;
        secondCar.year = 2000;

        firstCar.price = 80000;
        secondCar.price = 2000;

        firstCar.isSportCar = true;
        secondCar.isSportCar = false;

        firstCar.fuelTankCapacity = 80;
        secondCar.fuelTankCapacity = 90;

        firstCar.freeFuel = 80;
        secondCar.freeFuel = 40;

        firstCar.engineFuelOperationSystem = "Petrol";
        secondCar.engineFuelOperationSystem = "Diesel";

        secondCar.useFuel(5);
        firstCar.changeEngineFuelOperationSystem("Diesel");

        System.out.println("First car:");
        System.out.printf("Year: %d, Price: %.2f$, Is it a Sports car: %b, Fuel tank capacity: %d, Free fuel: %.2f" +
                " engine: %s",firstCar.year,firstCar.price,firstCar.isSportCar,firstCar.fuelTankCapacity,firstCar.freeFuel,firstCar.engineFuelOperationSystem);
        System.out.println();
        System.out.println("Second car:");
        System.out.printf("Year: %d, Price: %.2f$, Is it a Sports car: %b, Fuel tank capacity: %d, Free fuel: %.2f" +
                " engine: %s",secondCar.year,secondCar.price,secondCar.isSportCar,secondCar.fuelTankCapacity,secondCar.freeFuel,secondCar.engineFuelOperationSystem);

    }
}
