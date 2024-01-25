package recursion;

import java.util.Arrays;

public class ArrayMin {
    int min(int[] array, int currentMin) {
        if (array.length == 0) return Integer.MAX_VALUE;
        if(array.length == 1) return Math.min(currentMin, array[0]);
        if (currentMin > array[0]) {
            currentMin = array[0];
        }

        return min(Arrays.copyOfRange(array, 1, array.length), currentMin);
    }

    public static void main(String[] args) {
        System.out.println(new ArrayMin().min(new int[]{7, 2, 1, 9, 7, 1}, Integer.MAX_VALUE));
        System.out.println(new ArrayMin().min(new int[]{11, 2, 33, 44, 55, 6, 7}, Integer.MAX_VALUE));
        System.out.println(new ArrayMin().min(new int[]{1, 2, 3, -7}, Integer.MAX_VALUE));
    }
}
