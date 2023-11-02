package Homework1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scan.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNum = scan.nextInt();

        int temp  = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = temp;

        System.out.println("The first number is: " + firstNum);
        System.out.println("The second number is: " + secondNum);
        System.out.println("The third number is: " + thirdNum);

        int firstAndSecondSum = firstNum + secondNum;
        System.out.println("The sum between the first and second number is: " + firstAndSecondSum);
        int substraction = firstAndSecondSum - thirdNum;
        System.out.println("The difference is: " + substraction);


    }
}