package Homework4;

public class ComputerPrices {
    public static void main(String[] args) {
        Computer firstPc = new Computer(2000,500,"Windows");
        Computer secondPc = new Computer();
        secondPc.price = 500;

        System.out.println(firstPc.comparePrice(secondPc));
    }
}
