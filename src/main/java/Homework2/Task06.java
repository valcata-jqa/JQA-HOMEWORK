package Homework2;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};

        System.out.println(compare(first,second));
    }

    public static boolean compare(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }

        for(int i = 0; i < firstArray.length; i++) {
            if(firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}
