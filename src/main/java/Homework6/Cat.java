package Homework6;

public class Cat extends Animal {

    @Override
    void play() {
        System.out.println("The cat has started climbing");
    }

    Cat(String color, String favoriteFood, Boolean isItPlayful, int weight) {
        super(color, favoriteFood, isItPlayful, weight);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Meow!");
    }

    public void climp() {
        System.out.println("The cat has started climping!");
    }
}
