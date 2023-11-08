package Homework2;

import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int[] array = {10, 12, 1, 8, 4};
        /* Cloning with clone() Method:
        int[] cloned = easyClone(array);
        cloned[0] = 1;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(cloned));
         */

        // Cloning with loop
        int[] cloned = loopClone(array);
    }

    public static int[] easyClone(int[] arr) {
        return arr.clone();
    }

    public static int[] loopClone(int[] arr) {
        int size = arr.length;
        int[] cloned = new int[size];

        for (int i = 0; i < size; i++) {
            cloned[i] = arr[i];
        }

        return cloned;
    }
}
