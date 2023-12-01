package Homework6;

public class AnimalDemo {
    public static void main(String[] args) {
        Bird tweety = new Bird("blue", "corn", false, 1);
        Cat tom = new Cat("black", "tuna", false, 3 );
        Dog sharo = new Dog("white", "cats", true, 34);

        tweety.play();
        tom.play();
        sharo.play();

        tweety.makeSomeNoise();
        tom.makeSomeNoise();
        sharo.makeSomeNoise();

        tweety.synk(12);

    }
}
