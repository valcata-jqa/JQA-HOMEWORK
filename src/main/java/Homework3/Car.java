package Homework3;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    void useFuel(double fuel) {
        if (fuel > freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            freeFuel -= fuel;
        }
    }


}
