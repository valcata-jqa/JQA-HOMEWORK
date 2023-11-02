package Homework1;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Enter your first number");
        Scanner sc = new Scanner(System.in);
        double firstNum = sc.nextDouble();
        System.out.println("Your first number is " + firstNum);
        System.out.println("Enter your second number");
        double secondNum = sc.nextDouble();
        System.out.println("Your second number is " + secondNum);
        System.out.println("Enter your third number");
        double thirdNum = sc.nextDouble();

        if ((thirdNum > firstNum && thirdNum < secondNum) || ((thirdNum < firstNum && thirdNum > secondNum))) {
            System.out.println("The number is between the first and the second");
        } else {
            System.out.println("The number is not in between the first and second number");
        }

    }
}