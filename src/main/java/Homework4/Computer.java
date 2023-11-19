package Homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }
    Computer(){};

    int comparePrice(Computer compare) {
        if (this.price > compare.price) {
            return -1;
        }
        if (this.price < compare.price) {
            return 1;
        }
        return 0;
    }
}
