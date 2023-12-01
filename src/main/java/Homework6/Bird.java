package Homework6;

public class Bird extends Animal{

    @Override
    void play() {
        System.out.println("The bird has started flying around!");
    }

    Bird(String color, String favoriteFood, Boolean isItPlayful, int weight) {
        super(color, favoriteFood, isItPlayful, weight);
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Tweet Tweet");
    }
    public void fly() {
        System.out.println("The bird has started flying");
    }

    public void synk() {
        System.out.println("The bird is singing");
    }
    public void synk(int birdCount) {
        System.out.println(birdCount + " birds are singing");
    }
}
