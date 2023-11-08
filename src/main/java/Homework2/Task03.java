package Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        printArray();
    }

    public static void printArray() {
        Scanner scan = new Scanner(System.in);
        double[] array = new double[5];

        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            double current = scan.nextDouble();
            array[i] = current;
        }

        System.out.println(Arrays.toString(array));
    }
}
