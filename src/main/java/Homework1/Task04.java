package Homework1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your working hours");
        int workingHours = scan.nextInt();
        System.out.println("Enter your balance");
        double balance = scan.nextDouble();
        System.out.println("Is it the weekend? Answer with \"true\" or \"false\"");
        boolean isWeekend = scan.nextBoolean();

        if (!isWeekend) {
            System.out.println("I will go to work");
        } else if (balance > 10 ) {
            System.out.println("I will go to the cinema");
        } else if (balance <= 0 ) {
            System.out.println("I will watch TV at home");
        } else {
            System.out.println("I will buy icecream");
        }
    }
}