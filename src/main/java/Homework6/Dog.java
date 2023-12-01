package Homework6;

public class Dog extends Animal{
    @Override
    void play() {
        System.out.println("The dog wants to rub his belly");
    }

    Dog(String color, String favoriteFood, Boolean isItPlayful, int weight) {
        super(color, favoriteFood, isItPlayful, weight);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Bark Bark");
    }

    public void bringStick() {
        System.out.println("Good boy!!");
    }
}
