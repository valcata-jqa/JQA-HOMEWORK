package Homework6;

public abstract class Animal implements IAnimal {
    String color;
    String favoriteFood;
    Boolean isItPlayful;
    int weight;
    abstract void play();

    Animal(String color, String favoriteFood, Boolean isItPlayful, int weight) {
        this.color = color;
        this.favoriteFood = favoriteFood;
        this.isItPlayful = isItPlayful;
        this.weight = weight;
    }
}
