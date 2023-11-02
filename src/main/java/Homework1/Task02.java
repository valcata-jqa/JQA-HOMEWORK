package Homework1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        double secondNum = sc.nextDouble();
        int thirdNum = sc.nextInt();
        double fourthNum = sc.nextDouble();
        System.out.println("Initial :");
        System.out.println("firstNum: " + firstNum + " secondNum: " + secondNum + " thirdNum " + thirdNum + " fourthNum " + fourthNum);

        double temp;
        temp = firstNum;
        firstNum = (int)secondNum;
        secondNum = temp;

        temp = thirdNum;
        thirdNum = (int)fourthNum;
        fourthNum = temp;

        System.out.println("After swapping them :");
        System.out.println("firstNum: " + firstNum + " secondNum: " + secondNum + " thirdNum " + thirdNum + " fourthNum " + fourthNum);

        double firstSum = firstNum + secondNum + thirdNum + fourthNum;
        System.out.println(firstSum + " is the first sum");
        double secondSum = (double) firstNum + (int) secondNum + (double) thirdNum + (int) fourthNum;
        System.out.println(secondSum + " is the second sum");
    }
}