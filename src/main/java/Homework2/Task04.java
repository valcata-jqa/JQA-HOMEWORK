package Homework2;

public class Task04 {
    public static void main(String[] args) {
        int[] numArray = { 1, 2, 3 ,4 , 5, 6, 7, 8, 9, 10};
        forIteration(numArray);
        whileIteration(numArray);
    }

    public static void forIteration(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void whileIteration(int[] arr) {
        int counter = 0;

        while (counter < arr.length) {
            System.out.println(arr[counter]);
            counter++;
        }
    }
}
